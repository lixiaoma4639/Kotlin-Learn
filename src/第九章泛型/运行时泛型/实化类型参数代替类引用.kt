package 第九章泛型.运行时泛型

import java.util.*
import javax.xml.ws.Service

/**
 * 日期 : 2020/11/10.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val load = ServiceLoader.load(Service::class.java)
    val loadServiceLoader = loadServiceLoader<Service>()
}

inline fun <reified T> loadServiceLoader(): ServiceLoader<T>? {
    return ServiceLoader.load(T::class.java)
}