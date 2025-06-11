package 第九章泛型.类型形参

/**
 * 日期 : 2020/11/10.
 * 创建 : xin.li
 * 描述 : 默认情况下 类型形参的 界限是 Any?
 */

//类型形参默认是可空的
class Process<T>{
    fun process(value : T){
        value?.toString()
    }
}
//让类型形参不可空
class Process2<T : Any>{
    fun process(value : T){
        value.toString()
    }
}

fun main() {
    val process = Process<String?>()
    process.process("1")
    process.process(null)

    //error
//    val process2 = Process2<String?>()

    val value = setOf(1 , 2 , 3)
    println((value is List<*>))
    //error
//    println((value is List<Int>))
}

