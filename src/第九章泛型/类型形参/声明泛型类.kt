package 第九章泛型.类型形参

/**
 * 日期 : 2020/11/9.
 * 创建 : xin.li
 * 描述 :
 */

interface MyList<T>{
    operator fun get(index : Int) : T
}

class MyArrayList<T> : MyList<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }

}

class MyStringList : MyList<String>{
    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }
}