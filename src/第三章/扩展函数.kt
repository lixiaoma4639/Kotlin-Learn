package 第三章

/**
 * 日期 : 2020/10/19.
 * 创建 : xin.li
 * 描述 :
 */

fun main(args: Array<String>) {
    val joinToString = listOf<Int>(0, 1, 2, 3).joinToString()
    print(joinToString)

}

fun String.lastChar() : Char = this[this.length - 1]


fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}