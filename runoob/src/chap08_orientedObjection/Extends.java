package chap08_orientedObjection;
// java的继承
// 内部类可以当做大类的一个类型
// 访问静态内部类的时候，使用大类.内部类的形式；访问非静态内部类的时候，使用对象的方式
// private的作用范围指的是当前类，比如一个内部类的private变量，在当前大类下的所有类均可访问
public class Extends {
    public static void main(String[] args)
    {
        Animals animals = new Animals();
    }
    //静态内部类
    static class Animals{
        private String name;

    }
    //非静态内部类
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