package 第二章

import java.util.Random

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 :
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    val isRectangle: Boolean
        get() = height != width
}

fun createRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String>) {
    val random = Random()
    val rectangle = Rectangle(random.nextInt(), random.nextInt());
    println(rectangle.isSquare)
    println(rectangle.isRectangle)
}