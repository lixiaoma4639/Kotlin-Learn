package 第七章运算符重载和约定.重载运算符

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

data class Person4(val firstName: String, val lastName: String) : Comparable<Person4> {

    override fun compareTo(other: Person4): Int {
        return compareValuesBy(
            this, other, {
                //先比较firstName
                    person4 ->
                person4.firstName
            },
            //如果firstName相等了, 再比较lastName
            Person4::lastName
        )
    }
}

fun main() {
    val person4A = Person4("B", "b")
    val person4B = Person4("B", "d")

    println(person4A > person4B)
    println(person4A < person4B)
    println(person4A <= person4B)
    println(person4A == person4B)

}