package 第五章

/**
 * 日期 : 2020/10/28.
 * 创建 : xin.li
 * 描述 :
 */


fun main2() {
    val listOf = listOf<Int>(1, 2, 3, 4, 5)
    println(listOf.map { it * it })
    println(listOf.filter { it % 2 == 0 })

    val list = listOf<Person>(Person("张三", 28), Person("李四", 19))
    println(list.map { it.name })
    println(list.map(Person::name))
    println(list.filter { it.age > 20 }.map { it.name })
}

fun main1() {
    val list = listOf<Person>(Person("张三", 28), Person("李四", 19), Person("王五", 19))

    //all 需要判断集合中是否所有的元素都满足lambda条件判断
    println(list.all { it.age >= 18 })
    //any 需要判断集合是否有一个元素满足lambda条件判断
    println(list.any { it.age == 19 })
    //count 计数
    println(list.count { it.age == 19 })
    //查找满足表达式的元素
    println(list.find { it.age == 19 }?.name)
    println(list.firstOrNull { it.age == 19 }?.name)

    //根据lambda表达式分类,lambda表达式返回的值作为map字典的key
    val groupBy = list.groupBy(Person::age)
    println(groupBy)

    val letterList = listOf ("a","ab","b")
    println (letterList.groupBy (String:: first))

}


class Book (val title: String, val authors: List<String>)
fun main() {
    //flatMap 将集合的item转换为list后生成一个新的集合
    //当你卡在元素集合的集合不得不合并成一个的时候，你可能会想起 flatMap来
    val strings= listOf ("abc" , "def")
    println(strings.flatMap { it.toList() })

    var books = listOf<Book>(Book("围城" , listOf("钱钟书", "杨绛")) , Book("西游记" , listOf("罗贯中", "施耐庵")) , Book("水浒传" , listOf("施耐庵")))
    println(books.flatMap { it.authors }.toSet())

    //展开集合
    val flatten = listOf(listOf(1, 2, 3), listOf("a", "b", "c")).flatten()
    println(flatten)
}
fun main3() {
    val map = mapOf<Int, String>(1 to "aaa", 2 to "bbb")
    println(map.mapValues { it.value.toUpperCase() })
    println(map.mapKeys { it.key * 3 })
}