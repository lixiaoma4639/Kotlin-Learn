package 第十章注解和反射

/**
 * 日期 : 2020/11/15.
 * 创建 : xin.li
 * 描述 :
 */

@Deprecated("Use removeAt(index) instead." , ReplaceWith ("removeAt(index)"))
fun remove(index : Int){

}
fun removeAt(index : Int){

}

fun main() {
    remove(1)
}