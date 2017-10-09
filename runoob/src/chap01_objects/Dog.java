package chap01_objects;
public class Dog {
    //成员变量
    String color;
    int age;
    //类变量
    static int size;
    //默认构造方法
    public Dog()
    {

    }
    //自定义构造方法
    public Dog(String color)
    {
        this.color = color;
        System.out.println("调用了自定义构造方法");
    }
    //成员方法
    public void bark()
    {
        System.out.println("成员方法：bark");
    }
    public static void main(String[] args)
    {
        Dog dog = new Dog("pink");
        dog.bark();
        System.out.println("狗的颜色为："+ dog.color);
    }

}
