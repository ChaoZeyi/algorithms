package chap01_objects;
public class Dog {
    //��Ա����
    String color;
    int age;
    //�����
    static int size;
    //Ĭ�Ϲ��췽��
    public Dog()
    {

    }
    //�Զ��幹�췽��
    public Dog(String color)
    {
        this.color = color;
        System.out.println("�������Զ��幹�췽��");
    }
    //��Ա����
    public void bark()
    {
        System.out.println("��Ա������bark");
    }
    public static void main(String[] args)
    {
        Dog dog = new Dog("pink");
        dog.bark();
        System.out.println("������ɫΪ��"+ dog.color);
    }

}
