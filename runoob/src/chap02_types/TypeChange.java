package chap02_types;

public class TypeChange {
    //�Զ�����ת����ǿ������ת��
    public static void main(String[] args)
    {
        //ǿ������ת��
        int a = 128;
        byte b = (byte)a;
        System.out.println(b);
        //�Զ�����ת��
        char c = 'a';
        int i = c;
        System.out.println(c);
        System.out.println(i);
        //���� float ����ʱ���������ֺ������ F ���� f
        float f = 3.14f;
        long h = 92233720368545808L;

    }
}
