package 第九章泛型.泛型和子类型化

/**
 * 日期 : 2020/11/12.
 * 创建 : xin.li
 * 描述 :
 * 在类上声明 的 out 和 in 称为协变 / 逆变
 * 在方法或者变量上声明的 out 和 in 称为类型投影
 *
 *
 * 形参类型 : 指的是函数或者构造小括号()里面的 形参对应的类型
 * 实参类型 : 指的是调用函数或者构造传递给 小括号()对应的类型
 * 变量类型 : 变量命名后面对应的类型
 */
fun main() {
    val mutableList : MutableList<out Int> = mutableListOf(1, 2)
    //error
//    mutableList.add(3)

    copyData(mutableListOf<Any>("1" , "2") , mutableListOf<Any>())
    copyData2(mutableListOf<Int>(1, 2) , mutableListOf<Number>())
    copyData3(mutableListOf<Int>(1, 2) , mutableListOf<Number>())
    copyData3(mutableListOf(1.2, 2.2) , mutableListOf<Any>())
}


fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

//点变型, 类似java中的通配符, T : R 表示T必须是R的子类型
fun <T : R , R> copyData2(source: MutableList<T>, destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

//使用 协变 或者 逆变 简化 点变型
fun <T> copyData3(source: MutableList<out T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun <T> copyData4(source: MutableList<T>, destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}


