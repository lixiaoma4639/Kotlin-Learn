@file:JvmName("StringFunction")

package 第三章

/**
 * 日期 : 2020/10/18.
 * 创建 : xin.li
 * 描述 :
 */

fun main(args: Array<String>) {
    val list = arrayListOf<String>( "A" , "B" , "C")
    println(joinToString(list))
    //蓝色代表使用命名参数
    println(joinToString(list , separator = "; "))
    println(joinToString(list , " ~ " , postfix = "}" , prefix = "{"))
}

/**
 * 这个叫顶层属性,不依赖类
 */
const val REQUEST_HOTEL = 1001

/**
 * 这个叫顶层函数,不依赖类
 */
@JvmOverloads
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}