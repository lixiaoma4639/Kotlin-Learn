package 第九章泛型.泛型和子类型化

/**
 * 日期 : 2020/11/11.
 * 创建 : xin.li
 * 描述 :
 */

// out 关键字表示 让类型参数 T 成为协变类型, 意思就是T的子类 就是T的泛型子类
interface Producer<out T>{
    fun producer() : T
}



open class Animal{
    fun feed(){}
}

// 修改 T : Animal 为协变类型
class Herd<out T : Animal> {
    val list = listOf<T>()
    val size: Int get() = list.size
    operator fun get (i: Int) : T {
        return list[i]
    }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

open class Cat : Animal () {
    fun cleanLitter() {
        println("给猫咪洗澡....")
    }
}

fun takeCareOfCats(cats: Herd<Cat>){
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    //如果无法调用 , 是因为Herd<Animal> 是不变型的, Herd<Cat>不是 Herd<Animal> 的子泛型
//    feedAll(cats)
    //修改Herd<Animal>为协变类型后可以调用feedAll(animals: Herd<Animal>)方法
    feedAll(cats)
}


//
class Herd2<out T: Animal>(vararg animals: T) {

}

class Herd3<out T: Animal>(val animals: T) {

}

//变量会生成get和set方法 , 变型被使用在了set()方法的In位置上,因此不能这么定义
//class Herd4<out T: Animal>(var animals: T) {
//
//}

//私有的var就可以,因为不能被外界使用
class Herd5<out T: Animal>(private var animals: T) {

}















