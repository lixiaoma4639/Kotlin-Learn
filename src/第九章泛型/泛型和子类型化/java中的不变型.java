package 第九章泛型.泛型和子类型化;

import java.util.ArrayList;
import java.util.List;

/**
 * 日期 : 2020/11/11.
 * 创建 : xin.li
 * 描述 :
 */
class java中的不变型 {

    public static void main(String[] args) {
        //java中的泛型类都是不变型的, 因此ArrayList<String> 不是 List<Object> 的子类型
//        getH(new ArrayList<String>());
        getH(new ArrayList<Object>());
        getH(new ArrayList());
    }

    public static void getH(List<Object> list){

    }
}
