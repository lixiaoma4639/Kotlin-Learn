package 第四章对象.构造方法

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 * 3个User类是等价的
 */

class User constructor(name : String){
    val mName : String
    init {
        this.mName = name
    }
}

class User2 constructor(name : String){
    val mName : String = name
}

class User3(val name : String)


class Person(val name : String , val age : Int = 20)
class Person2(val name : String = "人", val age : Int = 20)


fun main() {
    val alice = User("李鑫")
    println(alice.mName)

    val person = Person("李四")
    val person2 = Person("李四" , 15)
    val person3 = Person(age =  15 , name = "王五")
    println(person.age)

    val person21 = Person2()
}