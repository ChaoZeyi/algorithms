package chap05;
// 内置数据类型（int byte) 和包装类(Integer Byte)的装箱、拆箱
public class NumberMath {
    public static void main(String[] args)
    {
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
        /**
         对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
         但是如果超出了这个值,系统会重新new 一个对象
         */
        /**
         注意 == 与 equals的区别
         == 它比较的是对象的地址
         equals 比较的是对象的内容
         */
        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);        // true
        System.out.println(a.equals(b));   // true
        Integer a1 = 1000;
        Integer b1 = 1000;
        System.out.println(a1 == b1);        // false
        System.out.println(a1.equals(b1));   // true

    }
}
