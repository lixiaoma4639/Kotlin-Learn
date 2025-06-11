package 第二章

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 : enum 软关键字, 只在class前面才有意义, 可以作为变量名称使用
 */
enum class Color {
    RED, BLACK, YELLOW , GREEN , BLUE
}

enum class Color2(
    val r: Int, val g: Int, val b: Int
) {
    RED(255 , 0 , 0),
    ORANGE(255 , 165 , 0);

    fun rgb() = (r * 256 + g) * 265 + b
}

fun main(args: Array<String>) {
    println(Color2.ORANGE.rgb())
}