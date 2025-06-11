package 第三章

/**
 * 日期 : 2020/10/19.
 * 创建 : xin.li
 * 描述 :
 */

var StringBuilder.lastChar : Char
    //第一个get()是属性访问器 , 第二个get是String的成员方法
    get() = get(length - 1)
    //{} 中一行代码可以使用=替代{},是否有返回值和=后面的句子有关
    set(value: Char) = setCharAt(length - 1 , value)


fun main(args: Array<String>) {
//    println("Kotlin".lastChar())
//    val sb = StringBuilder("Kotlin.")
//    sb.lastChar = '!'
//    println(sb)
//    println(sb.lastChar)

    var arrayListOf : ArrayList<String>? = arrayListOf<String>()
    arrayListOf = null
    println(arrayListOf?.isEmpty())
}

class AAA() {

}
