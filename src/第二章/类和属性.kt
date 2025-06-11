package 第二章

fun main(args: Array<String>) {
    val person2 = Person2("李三" , 19 , true);
    println(person2.name)
    println(person2.age)
    println(person2.isMarried)
    person2.isMarried = false;
    println(person2.isMarried)
}

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 : 值对象
 */
class Person(val name : String)

/**
 * bean属性
 */
class Person2(
    val name : String,
    var age : Int,
    var isMarried : Boolean
)

