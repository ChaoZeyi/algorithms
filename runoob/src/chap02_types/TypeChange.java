package chap02_types;

public class TypeChange {
    //自动类型转换、强制类型转换
    public static void main(String[] args)
    {
        //强制类型转换
        int a = 128;
        byte b = (byte)a;
        System.out.println(b);
        //自动类型转换
        char c = 'a';
        int i = c;
        System.out.println(c);
        System.out.println(i);
        //定义 float 类型时必须在数字后面跟上 F 或者 f
        float f = 3.14f;
        long h = 92233720368545808L;

    }
}
