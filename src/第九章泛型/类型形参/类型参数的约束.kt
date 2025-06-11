package 第九章泛型.类型形参

/**
 * 日期 : 2020/11/10.
 * 创建 : xin.li
 * 描述 :
 */

fun <T : Number> List<T>.getFirst() : T{
    return get(0)
}

fun <T : Number> toHalf(value : T) : Double{
    return value.toDouble() / 2.0
}

fun <T : Comparable<T>> max(first : T , second : T) : T{
    return if (first > second) first else second
}

// T类型形参必须 实现CharSequence又实现Appendable
fun <T> ensureTrailingPeriod( value: T) where T : CharSequence , T : Appendable {
    if (!value.endsWith("!")){
        value.append("!")
    }
    println(value)
}

fun main() {
    println(listOf(1 , 2).getFirst())
    println(toHalf(23))
    println(max("Java" , "Kotlin"))
//    println(max("Java" , 2))
//    ensureTrailingPeriod("Hello")
    ensureTrailingPeriod(StringBuilder("Hello World"))
}