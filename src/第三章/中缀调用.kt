package 第三章

/**
 * 日期 : 2020/10/20.
 * 创建 : xin.li
 * 描述 :
 *
 * to可以这样使用的原因是因为to是中缀表达式
 * 使用关键字infix修饰
 */

fun main(args: Array<String>) {
    val mapOf = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(mapOf)

    //解构声明
    val (name , age) = "liXin" to 20
    println("我叫$name , 我今年$age 岁了")
}