package 第十章注解和反射

/**
 * 日期 : 2021/2/5.
 * 创建 : xin.li
 * 描述 :
 */
class HasTempFolder {

    @get:Rule
    val folder = HasTempFolder();


    fun test(list: List<*>){
        @Suppress("UNCHECKED_CAST")
        var strings = list as List<String>
    }

}

fun main() {

}