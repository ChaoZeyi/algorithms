package chap03_symbols;
// 算术运算符、关系运算符、位运算符、逻辑运算符（短路运算符：&& ||，当第一个值就可以决定最终结果时，就不再运行第二个值)、赋值运算符
// 需要注意的是自加++和自减--
// 一个是先加再执行（++i），一个是先执行再加（i++）
public class Operator {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 25;
//        int d = 25;
//        System.out.println("a + b = " + (a + b) );
//        System.out.println("a - b = " + (a - b) );
//        System.out.println("a * b = " + (a * b) );
//        System.out.println("b / a = " + (b / a) );
//        System.out.println("b % a = " + (b % a) );
//        System.out.println("c % a = " + (c % a) );
//        System.out.println("a++   = " +  (a++) );
//        System.out.println("a--   = " +  (a--) );
//        // 查看  d++ 与 ++d 的不同
//        System.out.println("d++   = " +  (d++) );
//        System.out.println("++d   = " +  (++d) );
//        int a = 60; /* 60 = 0011 1100 */
//        int b = 13; /* 13 = 0000 1101 */
//        int c = 0;
//        c = a & b;       /* 12 = 0000 1100 */
//        System.out.println("a & b = " + c );
//
//        c = a | b;       /* 61 = 0011 1101 */
//        System.out.println("a | b = " + c );
//
//        c = a ^ b;       /* 49 = 0011 0001 */
//        System.out.println("a ^ b = " + c );
//
//        c = ~a;          /*-61 = 1100 0011 */
//        System.out.println("~a = " + c );
//
//        c = a << 2;     /* 240 = 1111 0000 */
//        System.out.println("a << 2 = " + c );
//
//        c = a >> 2;     /* 15 = 1111 */
//        System.out.println("a >> 2  = " + c );
//
//        c = a >>> 2;     /* 15 = 0000 1111 */
//        System.out.println("a >>> 2 = " + c );
//        int a = 5;//定义一个变量；
//        boolean b = (a<4)&(a++<10);
//        System.out.println("使用短路逻辑运算符的结果为"+b);
//        System.out.println("a的结果为"+a);
//        int c = 5;//定义一个变量；
//        boolean d = (c>4)||(c++<10);
//        System.out.println("使用短路逻辑运算符的结果为"+d);
//        System.out.println("a的结果为"+c);
        int a , b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b );

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println( "Value of b is : " + b );

    }
}
