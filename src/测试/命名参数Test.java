package 测试;

import 第三章.StringFunction;

import java.util.Arrays;

/**
 * 日期 : 2020/10/18.
 * 创建 : xin.li
 * 描述 :
 */
class 命名参数Test {
    public static void main(String[] args) {
        String s = StringFunction.joinToString(Arrays.asList(1, 2, 3));
        System.out.println("s = " + s);
    }
}
