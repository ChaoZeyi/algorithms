package chap03_symbols;
// ���η���Ϊ���֣��������η��ͷǷ������η�
// private default protected public
// private ˽�����ͣ�ֻ���ڵ�ǰ���ڷ��ʣ������Ҫ��ȡ�����͵ĳ�Ա����ֵ������ͨ��get����
// default Ĭ�Ϸ������ͣ���ͬһ�������
// protected ��ͬһ���ں������������
// public ȫ�����Է���

// static ���������෽���������
// final ֵ���ɸı䣬���ε��಻�ܱ��̳У����εķ������ܱ��ض���
// abstract ������ͳ��󷽷������һ����������󷽷�����һ��Ҫ����Ϊ�����࣬��֮����������Բ��������󷽷�
// synchronized ͬһʱ��ֻ�ܱ�һ���̷߳���
public class AccessControling {
    private String name = "aa";
    public int age;
    void add()
    {
        System.out.println("add");
    }
}
class child extends AccessControling{
    public static void main(String[] args)
    {
        AccessControling instance = new AccessControling();
        System.out.println(instance.age);
    }
}
abstract class abs{
    abstract void test();
}
class absChild extends abs{
    void test()
    {

    }
}
