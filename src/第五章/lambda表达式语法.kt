package 第五章

/**
 * 日期 : 2020/10/24.
 * 创建 : xin.li
 * 描述 :
 */

/**
 * 定义一个匿名函数lambda保存在一个变量里
 */
val sum = { x : Int , y : Int  -> x + y}


fun main(args: Array<String>) {
    println(sum(1 , 2))
    run { println("嗨...") }
}