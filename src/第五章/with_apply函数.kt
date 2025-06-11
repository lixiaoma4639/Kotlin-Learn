package 第五章

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */

fun alphabet() : String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){
        for (letter in 'A'..'Z'){
            this.append(letter)
        }
        append("\n我被添加了....")
        toString()
    }
}

//上下这两个方法是等价的
fun alphabet2() : String = with(StringBuilder()){
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\n我又被添加了....")
    toString()
}

fun main() {
    println(alphabet())
    println(alphabet2())
    println(alphabet3())
    println(alphabet4())
}

fun alphabet3() : String = StringBuilder().apply{
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\n我再次被添加了....")
}.toString()

fun alphabet4() : String = buildString {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\n我再再次被添加了....")
}