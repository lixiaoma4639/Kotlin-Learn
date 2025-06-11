package 第九章泛型.泛型和子类型化

import java.util.*
import kotlin.reflect.KClass

/**
 * 日期 : 2020/11/14.
 * 创建 : xin.li
 * 描述 :
 */


fun main1() {
    val list:MutableList<Any?> = mutableListOf('d' , 1 , "qwe")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements : MutableList<*> = if (Random().nextBoolean()) list else chars
//    unknownElements.add(42)
    println(unknownElements.first())
}

fun main2() {
    val validators = mutableMapOf<KClass<*> , FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

//    validators[String::class]!!.validate("")
    val defaultStringValidator = validators[String::class] as DefaultStringValidator
    println(defaultStringValidator.validate(""))

    //转换出错
    val defaultStringValidator2 = validators[Int::class] as FieldValidator<String>
//    println(defaultStringValidator2.validate(""))
}

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String>{
    override fun validate(input: String): Boolean {
        return input.isEmpty()
    }
}

object DefaultIntValidator : FieldValidator<Int>{
    override fun validate(input: Int): Boolean {
        return input >= 0
    }
}


fun main() {
    //对上面的操作进行优化
    Validators.registerValidators(String::class , DefaultStringValidator)
    Validators.registerValidators(Int::class , DefaultIntValidator)

    println(Validators[String::class].validate("kotlin"))
    println(Validators[Int::class].validate(23))
//    println(Validators[String::class].validate(23))
    println(Validators[Double::class].validate(23.0))
}


object Validators{
    private val validators = mutableMapOf<KClass<*> , FieldValidator<*>>()

    fun <T : Any> registerValidators(kClass: KClass<T> , fieldValidator: FieldValidator<T>){
        validators[kClass] = fieldValidator
    }

    operator fun <T : Any> get(kClass: KClass<T>) : FieldValidator<T>{
        return validators[kClass] as? FieldValidator<T> ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
    }
}












