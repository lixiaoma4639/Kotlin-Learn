package 第八章lambda作为形参和返回值.高级函数的控制流

/**
 * 日期 : 2020/11/8.
 * 创建 : xin.li
 * 描述 : 匿名函数 和普通函数没有关系, 匿名函数其实是lambda表达式的另一种语法,
 *          lambda表达式如何实现,以及内联函数等 也适用于匿名函数
 */

data class PersonAny(val name: String, val age: Int)


fun main() {
    val listOf = listOf(PersonAny("李鑫", 21))
    lookForLx(listOf)

    println(listOf.filter(fun(person): Boolean {
        return person.age > 20
    }))

    println(listOf.filter(fun (person) = person .age <20))
}


fun lookForLx(list: List<PersonAny>) {
    //使用匿名函数
    list.forEach(fun(person) {
        if (person.name == "lx") return
        println("没找到...")
    })
}