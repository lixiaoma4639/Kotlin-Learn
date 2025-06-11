package 第二章

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 : kotlin基础
 */

fun main(args: Array<String>) {
    println("hello....")
    println(max(1 , 2 ))
    println(max2(3 , 4 ))
    println(max2(5 , 6 ))
}

/**
 * 代码块函数体
 */
fun max(a : Int , b : Int) : Int {
    return if (a > b) a else b
}

/**
 * 表达式函数体
 */
fun max2 (a : Int , b : Int) : Int = if (a > b) a else b
fun max3 (a : Int , b : Int) = if (a > b) a else b

