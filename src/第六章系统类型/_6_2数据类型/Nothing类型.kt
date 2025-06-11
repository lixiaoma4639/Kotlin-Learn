package 第六章系统类型._6_2数据类型

import java.lang.IllegalStateException

/**
 * 日期 : 2020/11/1.
 * 创建 : xin.li
 * 描述 :
 */

//如果返回类型不是nothing,则person.name ?: failed("失败了....") 不能赋值给变量
fun failed(string: String) : Nothing{
    throw IllegalStateException(string)
}

class Person(val name: String?, val age: Int){}

fun main() {
    val person = Person(null, 18)
    val address = person.name ?: failed("失败了....")
    println(address.substringBefore("@"))
}