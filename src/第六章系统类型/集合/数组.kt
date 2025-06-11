package 第六章系统类型.集合

/**
 * 日期 : 2020/11/1.
 * 创建 : xin.li
 * 描述 :
 */

fun main2(args: Array<String>) {
    //此处<Int>对应的是java中的Integer封装类
    val arrayOf : Array<Int> = arrayOf(1, 2, 3, 4)
    println(arrayOf)

    val arrayOfNulls = arrayOfNulls<Int>(5)
    arrayOfNulls[0] = 0
    arrayOfNulls[1] = 1
    arrayOfNulls[2] = 2
    println(arrayOfNulls)

    val array = Array(26) { i -> ('a' + i).toString() }
    print(array.joinToString(""))
}

fun main2() {
    val strings= listOf("a" , "b" , "c")
    val toTypedArray = strings.toTypedArray()
//    "%s/%s/%s".format(toTypedArray)
    //vararg 可变参数, 传递数组时需要使用 * 展开数组
    println("%s/%s/%s".format(*toTypedArray))

    //IntArray 存储的相当于java中的基础数据类型int
    val intArrayOf : IntArray = intArrayOf(1, 2, 3)
}

fun main() {
    val fiveZeros = IntArray(5)
    println(fiveZeros.joinToString())
    val fiveZerosToo = intArrayOf(0 , 0 , 0 , 0 ,0)
    println(fiveZerosToo.joinToString())

    val intArray = IntArray(5) { i: Int -> i * i }
    println(intArray.joinToString())

    intArray.forEachIndexed { index, element -> println("角标是$index , 对应的值是 $element") }
}

