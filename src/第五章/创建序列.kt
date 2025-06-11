package 第五章

import java.io.File

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val generateSequence = generateSequence(0) { it + 1 }
    val takeWhile = generateSequence.takeWhile { it < 10 }
    println(takeWhile.sum())

    val file = File("/Users/lixin/AndroidStudioProjects/kotlin_space/.idea/kotlinc.xml")
    val isinsideHiddenDirectory = file.isinsideHiddenDirectory()
    println(isinsideHiddenDirectory)
}


fun File.isinsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }