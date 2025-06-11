package 测试;

import 第三章.扩展属性Kt;

/**
 * 日期 : 2020/10/19.
 * 创建 : xin.li
 * 描述 :
 */
class 扩展属性 {
    public static void main(String[] args) {
        char java = 扩展属性Kt.getLastChar(new StringBuilder("java"));
        System.out.println("java = " + java);
    }
}
