package chap04_constructor;
// 循环结构：while循环，do while循环，for循环
// 跳出循环：break;continue
// switch语句：case的值匹配之后，如果没有break语句，就会一直执行之后的语句
public class Circle {
    public static void main(String[] args)
    {
        int i = 10;
        while(i < 20)
        {
            System.out.println(i);
            i++;
        }
        i = 10;
        do{
            System.out.println(i);
            i++;
        }while(i < 20);// do while循环至少会执行一次

        char grade = 'C';
        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

    }
