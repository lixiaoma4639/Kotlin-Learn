package 第六章系统类型._6_1可控性.可空性和java;

/**
 * 日期 : 2020/10/31.
 * 创建 : xin.li
 * 描述 :
 */
interface StringProcess {
    void process(String string);

    public static void main(String[] args) {
        NullableStringProcess nullableStringProcess = new NullableStringProcess();
        nullableStringProcess.process("hello, kotlin...");
//        nullableStringProcess.process(null);

        StringImpl string = new StringImpl();
        string.process(null);
    }
}
