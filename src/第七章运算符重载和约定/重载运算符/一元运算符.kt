package 第七章运算符重载和约定.重载运算符

import java.math.BigDecimal

/**
 * 日期 : 2020/11/3.
 * 创建 : xin.li
 * 描述 :
 */

data class Pixel(val x : Int , val y : Int){
}

//负数法
operator fun Pixel.unaryMinus() : Pixel {
    return Pixel(-x , -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    val pixel = Pixel(1, 2)
    println(-pixel)

    var zero = BigDecimal.ZERO
    println(zero++)
    println(++zero)

}