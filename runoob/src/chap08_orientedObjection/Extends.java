package chap08_orientedObjection;
// java�ļ̳�
// �ڲ�����Ե��������һ������
// ���ʾ�̬�ڲ����ʱ��ʹ�ô���.�ڲ������ʽ�����ʷǾ�̬�ڲ����ʱ��ʹ�ö���ķ�ʽ
// private�����÷�Χָ���ǵ�ǰ�࣬����һ���ڲ����private�������ڵ�ǰ�����µ���������ɷ���
public class Extends {
    public static void main(String[] args)
    {
        Animals animals = new Animals();
    }
    //��̬�ڲ���
    static class Animals{
        private String name;

    }
    //�Ǿ�̬�ڲ���
    class Plants{
        private String name;
        Animals animals = new Animals();
        void test(){
            //animals.name;
        }
    }

}
class testClass{

    public static void main(String[] args)
    {
        Extends.Animals animals = new Extends.Animals();
        Extends.Plants plants = new Extends().new Plants();

    }
}