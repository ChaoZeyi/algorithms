package chap04_constructor;
// ѭ���ṹ��whileѭ����do whileѭ����forѭ��
// ����ѭ����break;continue
// switch��䣺case��ֵƥ��֮�����û��break��䣬�ͻ�һֱִ��֮������
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
        }while(i < 20);// do whileѭ�����ٻ�ִ��һ��

        char grade = 'C';
        switch(grade)
        {
            case 'A' :
                System.out.println("����");
                break;
            case 'B' :
            case 'C' :
                System.out.println("����");
            case 'D' :
                System.out.println("����");
            case 'F' :
                System.out.println("����Ҫ��Ŭ��Ŭ��");
                break;
            default :
                System.out.println("δ֪�ȼ�");
        }
        System.out.println("��ĵȼ��� " + grade);
    }

    }
