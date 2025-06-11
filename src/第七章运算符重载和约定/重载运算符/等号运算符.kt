package 第七章运算符重载和约定.重载运算符

/**
 * 日期 : 2020/11/3.
 * 创建 : xin.li
 * 描述 :
 */

/**
 * kotlin 中 == 默认调用的Any 对象中的 equals方法
 */
class Pixel2(val x : Int , val y : Int){
    override fun equals(other: Any?): Boolean {
        // === 恒等于号, 表示判断对象引用地址是否一致, ===符号不能被重载
        if (this === other) return true
        if (other !is Pixel2) return false
        return x == other.x && y == other.y
    }
}

fun main() {
    val pixel2A = Pixel2(1, 2)
    val pixel2B = Pixel2(1, 2)
    println(pixel2A == pixel2B)
    println(pixel2A == pixel2A)
    println(pixel2A == Any())
    // != 编译器会先调用==然后再取反!
    println(pixel2A != Any())
}