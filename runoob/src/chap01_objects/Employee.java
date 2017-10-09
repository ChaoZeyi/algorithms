package chap01_objects;

public class Employee {
    //成员变量
    int age;
    String name;
    double salary;
    //类变量
    static String company;
    //成员变量和类变量的区别在于：成员变量针对的是一个对象，不同对象的成员变量的值互不影响；类变量针对的是整个类，他的值被所有的类对象共享，并且每个类对象都可以改变该值
    //构造器
    public Employee(String name)
    {
        this.name = name;
    }
    //成员方法
    public void empAge(int age)
    {
        this.age = age;
    }
    public void empSalary(double salary)
    {
        this.salary = salary;
    }
    public void empCompany(String company)
    {
        Employee.company = company;
    }
    public void print()
    {
        System.out.println("名字: "+this.name);
        System.out.println("年龄： "+this.age);
        System.out.println("工资： "+this.salary);
        System.out.println("公司： "+company);
    }
}
