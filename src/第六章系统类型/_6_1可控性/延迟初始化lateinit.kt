package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/31.
 * 创建 : xin.li
 * 描述 :
 */

class Activity{
    private lateinit var name : String

    fun onCreate(){
        name = "李世民"
    }

    fun test() : Boolean{
        return name.equals("李鑫")
    }
}

fun main() {
    val activity = Activity()
    activity.onCreate()
    println(activity.test())
}