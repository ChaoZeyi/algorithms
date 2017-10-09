package chap01_objects;

public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("zhangsan");
        emp1.empAge(20);
        emp1.empSalary(1000);
        emp1.empCompany("runoob");

        Employee emp2 = new Employee("lisi");
        emp2.empAge(21);
        emp2.empSalary(2000);
        emp2.empCompany("runoob2");

        emp1.print();
        emp2.print();

    }
}
