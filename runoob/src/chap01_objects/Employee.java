package chap01_objects;

public class Employee {
    //��Ա����
    int age;
    String name;
    double salary;
    //�����
    static String company;
    //��Ա��������������������ڣ���Ա������Ե���һ�����󣬲�ͬ����ĳ�Ա������ֵ����Ӱ�죻�������Ե��������࣬����ֵ�����е������������ÿ������󶼿��Ըı��ֵ
    //������
    public Employee(String name)
    {
        this.name = name;
    }
    //��Ա����
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
        System.out.println("����: "+this.name);
        System.out.println("���䣺 "+this.age);
        System.out.println("���ʣ� "+this.salary);
        System.out.println("��˾�� "+company);
    }
}
