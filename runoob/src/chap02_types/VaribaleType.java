package chap02_types;

public class VaribaleType {
    //��Ա������ʵ��������,���Բ���ʼ������ֵ����Ĭ��Ϊ0���������ͱ���Ĭ��Ϊfalse���������ͱ���Ĭ��ΪNull
    int age;
    //��̬�������������
    static String s = "runoon";
    public void method()
    {
        //�ֲ�����,����Ҫ��ʼ��
        int i = 100;
    }
    public static void main(String[] args)
    {
        VaribaleType varibaleType = new VaribaleType();
        System.out.println(varibaleType.age);
    }
}
