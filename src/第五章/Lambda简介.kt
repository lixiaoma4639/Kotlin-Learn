package 第五章

import 第三章.joinToString

/**
 * 日期 : 2020/10/24.
 * 创建 : xin.li
 * 描述 :
 */

data class Person(val name : String , val age : Int){
    fun getNameStr() : String{
        return name;
    }
}

fun Person.isAdult() = age > 18

fun main() {
    //将创建person对象的行为保存起来
    val createPerson = ::Person
    //使用上面的行为去创建对象
    val person = createPerson("李鑫", 19)
    println(person)

    //一个叫lambdaIsAdult的lambda函数,参数 person:Person,返回isAdult函数的值
    val lambdaIsAdult = Person::isAdult
    println(lambdaIsAdult(person))

    //保存person对象的isAdult成员方法
    val kFunction0 = person::isAdult
    println(kFunction0())

}

fun main2(args: Array<String>) {
    val list = listOf<Person>(Person("楼下", 28), Person("给个", 20))
    println(list.maxBy{ it.age })
    //上面的语法等价于下面的语法
    list.maxBy {
            value : Person -> value.name
    }
    //也等价于下面的语法
    println(list.maxBy(Person::getNameStr))

    //以下两种表达意思完全一样
    val joinToString = list.joinToString(separator = ",", transform = { p: Person -> p.name })
    val joinToString2 = list.joinToString(separator = ",") { p: Person -> p.name }
//    println(joinToString)
}