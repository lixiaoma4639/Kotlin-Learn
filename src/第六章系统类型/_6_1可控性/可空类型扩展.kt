package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/31.
 * 创建 : xin.li
 * 描述 :
 */

fun input(string: String?){
    if (string.isNullOrBlank()){
        println("""这是一个null/""/" "字符串...  """)
    }
}
fun input2(string: String?){
    //isNullOrBlank 认为" "也是空
    //isNullOrEmpty 只认为null 和"" 是空
    if (string.isNullOrEmpty()){
        println("""这是一个null/""/" "字符串...  """)
    }
}

fun main() {
    input2(null)
    input2("")
    input2(" ")
}