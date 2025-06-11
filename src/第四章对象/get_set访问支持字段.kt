package 第四章对象

/**
 * 日期 : 2020/10/22.
 * 创建 : xin.li
 * 描述 :
 */

class User2(val name : String){
    var address : String = "渭南"
        set(value) {
            println("$field 转换为 $value")
            field = value
        }
        get() {
            return "$field 哈哈哈"
        }
}

fun main() {
    val user2 = User2("李鑫")
    println(user2.address)
    user2.address = "北京";
    println(user2.address)
    user2.address = "西安";
    println(user2.address)
}