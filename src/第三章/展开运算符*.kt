package 第三章

/**
 * 日期 : 2020/10/20.
 * 创建 : xin.li
 * 描述 :
 * vararg 关键字, 可变参数
 */
fun main(args: Array<String>) {
    val strings = arrayOf("1", "2", "3")
    val listOf = listOf<String>("args: ", *strings)
    println(listOf)
}