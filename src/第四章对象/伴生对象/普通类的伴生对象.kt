package 第四章对象.伴生对象


/**
 * 日期 : 2020/10/24.
 * 创建 : xin.li
 * 描述 :
 */

/**
 * 普通类的伴生对象
 */
class Person(val name : String){
    companion object Loader{
        fun fromJson(json : String) : Person {
            return Person(json)
        }
    }
}

/**
 * 实现了接口的普通伴生对象
 * 类的伴生对象会同样被编译成常规对象: 类中的一个引用了它的实例的静态字段。如果伴生对象没有命名，在 Java代码中它可以通过 Companion 引用 来访问,
 * 比如Person2.Companion.fromJson
 */
interface JsonFactory<T>{
    fun fromJson(json : String) : T
}
class Person2(val name : String){
    //在伴生对象中实现接口, 可以直接将包含伴生对象的类的名字Person2当做实现了改接口JsonFactory的对象实例来使用
    companion object : JsonFactory<Person2>{
        override fun fromJson(json: String): Person2 {
            return Person2(json)
        }
    }
}
class Load<T>{
    fun <T> loadFromJson(factory: JsonFactory<T>) : T{
        return factory.fromJson("hhhhh")
    }
}

fun main(args: Array<String>) {
    //1
//    println(Person.fromJson("hello").name)
//    println(Person.Loader.fromJson("world").name)
//
//    println(Person.Loader)
//    println(Person.Loader)

    //2以下两种表达一个意思
    val load = Load<Person2>()
    println(load.loadFromJson(Person2).name)
    println(load.loadFromJson(Person2.Companion).name)

    println(Person2)
    println(Person2)
    println(Person2.Companion)
//
//    //3
    val fromJson = Person3.fromJson("嗨,")
    println(fromJson.name)
}

/**
 * 伴生对象的扩展
 */
class Person3(val name : String){
    //声明空的伴生对象
    companion object{}
}
fun Person3.Companion.fromJson(json : String) : Person3{
    return Person3("$json 我是伴生对象的扩展函数...")
}