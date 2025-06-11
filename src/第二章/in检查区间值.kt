package 第二章

/**
 * 日期 : 2020/10/18.
 * 创建 : xin.li
 * 描述 :
 */
fun main(args: Array<String>) {
    println(isLetter('1'))
    println(isDigit('1'))
    println(recognize('好'))
}

fun isLetter(c : Char) = c in 'A' .. 'Z' || c in 'a' .. 'z'
fun isDigit(c : Char) = c in '0' .. '9'

fun recognize(c : Char) = when (c) {
    in '0' .. '9' -> "这是数字..."
    in 'a' .. 'z', in 'A' .. 'Z' -> "这是字母..."
    else -> "我不知道..."
}