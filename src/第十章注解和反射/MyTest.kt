package 第十章注解和反射

/**
 * 日期 : 2021/2/2.
 * 创建 : xin.li
 * 描述 :
 */
class MyTest {
    @Deprecated("remove 方法过时" , ReplaceWith("removeAt(index)"))
    fun remove(index : Int){

    }

    fun removeAt(index : Int){

    }
}

fun main() {
    val myTest = MyTest();
    myTest.removeAt(1);
}