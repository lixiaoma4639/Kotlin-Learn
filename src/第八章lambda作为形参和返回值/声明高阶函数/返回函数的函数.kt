package 第八章lambda作为形参和返回值.声明高阶函数

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

//返回类型是 函数 (Order) -> Double , 改函数类型 接受一个参数 返回一个Double类型
fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return { order -> (1.3 * order.itemCount) }
}

fun main3() {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println ("shipping costs ${calculator(Order(3))}")

    val calculator2 = getShippingCostCalculator(Delivery.STANDARD)
    println ("shipping costs ${calculator2(Order(3))}")
}

/**
 * 实现联系人功能
 */
class ContactListFilters{
    var prefix: String = ""
    //true 表示仅查找有电话号码的联系人
    var onlyWithPhoneNumber : Boolean = false

    fun getPredicate (): (Person) -> Boolean {
        val startsWithPrefix = {
            p : Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startsWithPrefix
        }
        return {
            startsWithPrefix(it) && it.phoneNumber != null
        }
    }
}

data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)

fun main() {
    val contacts = listOf(Person("li", "xin", "17611672737"), Person("zhang", "san", null))
    val contactListFilters = ContactListFilters()
    with (contactListFilters) {
        prefix = "x"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))
}