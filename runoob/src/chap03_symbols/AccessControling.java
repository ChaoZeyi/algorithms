package chap03_symbols;
// 修饰符分为两种，访问修饰符和非访问修饰符
// private default protected public
// private 私有类型：只能在当前类内访问，如果需要获取该类型的成员变量值，必须通过get方法
// default 默认访问类型，在同一包类访问
// protected 在同一包内和所有子类访问
// public 全部可以访问

// static 用来修饰类方法和类变量
// final 值不可改变，修饰的类不能被继承，修饰的方法不能被重定义
// abstract 抽象类和抽象方法，如果一个类包含抽象方法，就一定要声明为抽象类，反之，抽象类可以不包含抽象方法
// synchronized 同一时间只能被一个线程访问
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
