package 第八章lambda作为形参和返回值.声明高阶函数

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val listOf = listOf("a", "b", "c")
    println(listOf.joinToString())

    //传递lambda给 函数类型参数transform
    println(listOf.joinToString {
        it.toUpperCase()
    })

    println(listOf.joinToString("; " , "[" , "]" ){
        it.toUpperCase()
    })

    println(listOf.joinToString2())
}


fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() } // { it.toString() } 是 函数类型参数transform的默认值
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element))
    }

    result.append(postfix)
    return result.toString()
}

fun <T> Collection<T>.joinToString2(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: ((T) -> String)? = null // { it.toString() } 是 函数类型参数transform的默认值
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        //处理lambda可能为空的情况
        val s = transform?.invoke(element) ?: element.toString()
        result.append(s)
    }

    result.append(postfix)
    return result.toString()
}

fun foo (callback : ((Int) -> Unit)? ){
    //函数类型 的参数如果是可空的, 使用必须判空
    if (callback != null) {
        callback(22)
    }
}