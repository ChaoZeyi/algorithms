package chap03_symbols;
// �������������ϵ�������λ��������߼����������·�������&& ||������һ��ֵ�Ϳ��Ծ������ս��ʱ���Ͳ������еڶ���ֵ)����ֵ�����
// ��Ҫע������Լ�++���Լ�--
// һ�����ȼ���ִ�У�++i����һ������ִ���ټӣ�i++��
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
//        // �鿴  d++ �� ++d �Ĳ�ͬ
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
//        int a = 5;//����һ��������
//        boolean b = (a<4)&(a++<10);
//        System.out.println("ʹ�ö�·�߼�������Ľ��Ϊ"+b);
//        System.out.println("a�Ľ��Ϊ"+a);
//        int c = 5;//����һ��������
//        boolean d = (c>4)||(c++<10);
//        System.out.println("ʹ�ö�·�߼�������Ľ��Ϊ"+d);
//        System.out.println("a�Ľ��Ϊ"+c);
        int a , b;
        a = 10;
        // ��� a ���� 1 ������������ b Ϊ 20������Ϊ 30
        b = (a == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b );

        // ��� a ���� 10 ������������ b Ϊ 20������Ϊ 30
        b = (a == 10) ? 20 : 30;
        System.out.println( "Value of b is : " + b );

    }
}
