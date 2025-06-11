package 第八章lambda作为形参和返回值.声明高阶函数.在java中;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

import java.util.ArrayList;
import java.util.List;

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */
class 使用函数类 {
    public static void main(String[] args) {
        在java中使用函数类Kt.processTheAnswer(integer -> integer * 2);
        在java中使用函数类Kt.processTheAnswer(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer integer) {
                return integer + 1;
            }
        });


        List<String> strings = new ArrayList<>();
        strings.add("44");
        //在java中调用kotlin的扩展函数,必须要显式地传递一个接收者对象作为扩展函数的第一个参数
        CollectionsKt.forEach(strings, new Function1<Object, Unit>() {
            @Override
            public Unit invoke(Object o) {
                System.out.println("o = " + o);
                //而且必须要有返回值
                return Unit.INSTANCE;
            }
        });
        CollectionsKt.forEach(strings, s -> {
            System.out.println("s = " + s);
            return Unit.INSTANCE;
        });
    }
}
