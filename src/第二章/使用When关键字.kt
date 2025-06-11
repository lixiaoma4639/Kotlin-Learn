package 第二章

import java.lang.Exception

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 : when 相当于java中的switch
 */

fun getMnemonic(color: Color) = when (color) {
    Color.BLACK -> "黑色"
    Color.RED -> "红色"
    Color.YELLOW -> "黄色"
    Color.BLUE , Color.GREEN -> "其他"
}

fun mix(c1 : Color , c2: Color) = when (setOf(c1 , c2)){
    setOf(Color.BLUE , Color.GREEN) -> "绿蓝"
//    setOf(Color.GREEN , Color.BLUE) -> "蓝绿"
    setOf(Color.BLACK , Color.RED) -> "黑红"
    else -> throw Exception("ffff");
}

fun main(args: Array<String>) {
    println(getMnemonic(Color.YELLOW))
    println(getMnemonic(Color.BLUE))
    println(mix(Color.GREEN , Color.BLUE))
}