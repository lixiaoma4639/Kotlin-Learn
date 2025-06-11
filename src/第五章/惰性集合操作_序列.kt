package 第五章

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val list = listOf<Person>(Person("张三a", 28), Person("李四bb", 19), Person("王五ccc", 19))
//    val toList = list.asSequence().map {
//        println("map 是 $it")
//        it.age + 1
//    }.filter {
//        println("filter 是 $it")
//        it == 20
//    }.toList()

    println(list.asSequence().map {
        it.age to it.name
    }.toMap())

    //先转换再判断长度, map序列执行3次 , filter执行3次
    println(list.asSequence().map { it.name }.filter { it.length > 3}.toList())
    //先判断长度再转换 , filter执行3次 , map序列执行2次
    println(list.asSequence().filter { it.name.length > 3 }.map { it.name }.toList())

    val numbers = listOf(1 , 2 ,3 , 4)
    //使用asSequence序列可以减少 遍历次数
    println(numbers.asSequence().map { it * it }.find { it > 3 })
    println(numbers.map { it * it }.find { it > 3 })


}