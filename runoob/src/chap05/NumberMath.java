package chap05;
// �����������ͣ�int byte) �Ͱ�װ��(Integer Byte)��װ�䡢����
public class NumberMath {
    public static void main(String[] args)
    {
        System.out.println("90 �ȵ�����ֵ��" + Math.sin(Math.PI/2));
        System.out.println("0�ȵ�����ֵ��" + Math.cos(0));
        System.out.println("60�ȵ�����ֵ��" + Math.tan(Math.PI/3));
        System.out.println("1�ķ�����ֵ�� " + Math.atan(1));
        System.out.println("��/2�ĽǶ�ֵ��" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
        /**
         ���ڨC128��127��Ĭ����127��֮���ֵ,��װ��󣬻ᱻ�����ڴ����������
         ����������������ֵ,ϵͳ������new һ������
         */
        /**
         ע�� == �� equals������
         == ���Ƚϵ��Ƕ���ĵ�ַ
         equals �Ƚϵ��Ƕ��������
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
