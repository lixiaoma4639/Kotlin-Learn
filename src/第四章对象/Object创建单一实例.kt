package 第四章对象

import java.io.File

/**
 * 日期 : 2020/10/24.
 * 创建 : xin.li
 * 描述 :
 *
 * object关键字显式创建的类只能生产一个对象,在任何地方调用,地址都是一样的
 */

data class Person(val name : String){

    object NameComparator : Comparator<Person>{
        override fun compare(o1: Person, o2: Person): Int =
            o1.name.compareTo(o2.name)
    }
}

fun main() {

    val person = Person("fff")
    val nameComparator = Person.NameComparator
    println(nameComparator)

    val persons = listOf<Person>(Person("展示"), Person("展示2"))
    println(persons.sortedWith(nameComparator))

    println("-----")

    println(FileSingle.compare(File("/User"), File("/user")))

    val listOf = listOf(File("/Z"), File("/a"))
    println(listOf.sortedWith(FileSingle))
}

object FileSingle : Comparator<File>{
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}