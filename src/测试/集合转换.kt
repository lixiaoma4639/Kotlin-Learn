package 测试

import java.math.BigDecimal

/**
 * 日期 : 2021/6/29.
 * 创建 : xin.li
 * 描述 :
 */
fun main2() {
//    val numbers = listOf(5, 2, 10, 4)
//    val sum = numbers.reduce { sum, element -> sum + element }
//    println(sum)
//
//    val sumDoubled = numbers.fold(0) { sum, element -> sum + element * 2 }
//    println(sumDoubled)

//    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
//    println(numberSets)
//    println(numberSets.flatten())

//    val numbers = setOf(1, 2, 3)
//    println(numbers.map { it * 3 })
//    println(numbers.mapIndexed { idx, value -> (value * idx).toDouble() })

//    val containers = listOf(
//        StringContainer("1", listOf("one", "two", "three")),
//        StringContainer("2", listOf("four", "five", "six")),
//        StringContainer("3", listOf("seven", "eight"))
//    )
//    println(containers)

//    val strS = mutableListOf<String>()
//    containers.flatMap {
//        strS.add(it.name)
//        it.values ?: emptyList()
//    }.forEach {
//        strS.add(it)
//    }
//    containers.forEach {
//        strS.add(it.name)
//        it.values.forEach { it2 ->
//            strS.add(it2)
//        }
//    }
//    println(strS)

//    val mapOf = mapOf<String, Int>(
//        "1" to 1,
//        "3" to 3,
//        "4" to 4
//    )
//    (mapOf as MutableMap)["2"] = 2
//    println(mapOf)

//    val aaa : StringContainer? = null
//    println(aaa?.name.isNullOrEmpty())

    val bbb: String? = null
    when(bbb){
        "ffff" -> println("ffff")
        else -> println("else")
    }

    val listOf = listOf<String>("aaa", "bbb", "ccc", "aaa", "aaa", "ccc", "ddd", "bbb", "ccc")
    listOf
}

fun main3() {
    println(
        mapOf<String, Any?>(
            "aaa" to 1,
            "bbb" to 2
        )["ccc"] as? Int ?: 122
    )

    var type : String? = null
    when(type){
        "111" -> {}
        else -> {
            println("null")
        }
    }

    val stringContainer = StringContainer(null, null)
    println(null == "Aaaa")
}


fun main() {
//    val aaa = "系统已成功将您的全部%s个预订记录绑定到同一会员账户，其中包括以下%i个为待入住的预订。如有任何疑问，请联系我们查询。"
//    println(String.format(aaa, "10",  2))

//    val sss= listOf(
//        StringContainer("1", listOf(
//            "aaa", "bbb", "cccc"
//        )),
//        StringContainer("2", listOf(
//            "aaa2", "bbb2", "cccc2"
//        )),
//        StringContainer("1", null)
//    )
//
//    println(
//        sss.flatMap {
//            it.values ?: emptyList()
//        }
//    )
//
//    println(sss[0].values)
    val aaa = listOf(
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.01"),
        BigDecimal("0.011"),
        BigDecimal("0.01"),
        BigDecimal("0.01")
    )
    val totalPrice = aaa.fold(BigDecimal("0.01")){
            acc, t -> acc + t
    }
//    println(totalPrice)
//    println(totalPrice.setScale(2, RoundingMode.HALF_UP))


//    val bbb = emptyList<Double>(
//    )
//    val bbbPrice = bbb.reduce{
//            acc, t -> acc + t
//    }
//    println(bbbPrice)

//    println()

    val fff = listOf<A>(C("1"), C("2"), C("3"), C("4"))
    val names = fff.mapNotNull {
        if ( it is B && !it.name.isNullOrEmpty()) {
            it.name
        } else {
            null
        }
    }.joinToString(separator = "-")
    println(names)
}

interface A {
    open var name : String?
}

class C(override var name: String?) : A {
}

class B(override var name: String?) : A {
}


data class StringContainer(val name : String?, val values: List<String>?)