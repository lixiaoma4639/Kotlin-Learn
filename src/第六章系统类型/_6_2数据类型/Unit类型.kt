package 第六章系统类型._6_2数据类型

/**
 * 日期 : 2020/11/1.
 * 创建 : xin.li
 * 描述 :
 */

interface Process<T>{
    fun process() : T
}

class ProcessImpl : Process<Unit>{
    override fun process() {
        //泛型如果是Unit, 则方法实现中可以没有返回值
    }
}