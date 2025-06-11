package 第三章

/**
 * 日期 : 2020/10/19.
 * 创建 : xin.li
 * 描述 :
 *
 *
 */

fun main(args: Array<String>) {
    val strings: List<String> = listOf("one" , "two" , "three")
    println(strings.last())

    val of:Collection<Int> = setOf<Int>(1, 2, 3)
    println(of.max())
}