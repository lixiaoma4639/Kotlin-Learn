package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */
fun main() {
    println(stringLengthSafe(null))
    println(stringLengthSafe("null"))
}

fun stringLengthSafe(string: String?) : Int{
    return if (string != null) string.length else 0
}