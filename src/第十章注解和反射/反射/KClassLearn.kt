package 第十章注解和反射.反射

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KFunction1
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties


/**
 * 日期 : 2021/2/5.
 * 创建 : xin.li
 * 描述 :
 */
data class Person2(
    val name: String ,
    val age : Int
)

fun main2() {
    val person2 = Person2("kx", 34)
    val kClass = person2.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach {
        println(it.name)
    }

}
var counter = 0;
fun main() {
    val kFunction : KFunction1<Int, Unit> = ::foo
    kFunction.call(42)

    val kFunction2 = ::sum
    kFunction2.invoke(1  , 2)


    var kProperty = ::counter
    kProperty.setter.call(33)
    println(kProperty.get())


    val person2 = Person2("xxx", 345)
    val kMemberProperty = Person2::age
    println(
        kMemberProperty.get(person2)
    )
//    KProperty1
}

fun foo(x : Int) = println(x * 2)

fun sum(x : Int , y : Int ){
    println(x + y)
}