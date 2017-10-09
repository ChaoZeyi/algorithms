package chap02_types;

public class VaribaleType {
    //成员变量（实例变量）,可以不初始化，数值变量默认为0，布尔类型变量默认为false，引用类型变量默认为Null
    int age;
    //静态变量（类变量）
    static String s = "runoon";
    public void method()
    {
        //局部变量,必须要初始化
        int i = 100;
    }
    public static void main(String[] args)
    {
        VaribaleType varibaleType = new VaribaleType();
        System.out.println(varibaleType.age);
    }
}
