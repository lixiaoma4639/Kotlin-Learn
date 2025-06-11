package 第八章lambda作为形参和返回值.内联函数

/**
 * 日期 : 2020/11/8.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val listOf = listOf(1, 2)
    listOf.filter { it >= 2 }
    listOf.asSequence().filter { it >= 2 }
}