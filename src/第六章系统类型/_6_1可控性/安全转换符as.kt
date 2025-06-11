package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/30.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val person1 = Person("张三", 20)
    val person2 = Person("张三", 20)
    println(person1 == person2)
    println(person1.equals(42))
}

class Person(val name: String, val age: Int){

    override fun equals(other: Any?): Boolean {
        //1.as?判断other是否是Person对象 , 再通过?:判断是否为空
        val otherPerson = other as? Person ?: return false
        println("被触发了....")
        return otherPerson.name == name && otherPerson.age == age
    }

    override fun hashCode(): Int {
        return name.hashCode() * 37 + age.hashCode()
    }
}