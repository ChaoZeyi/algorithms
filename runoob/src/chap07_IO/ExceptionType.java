package chap07_IO;

import java.io.FileInputStream;
//catch ���ܶ����� try ���ڡ�
//�� try/catch ������� finally �鲢��ǿ����Ҫ��ġ�
//try, catch, finally ��֮�䲻������κδ��롣
public class ExceptionType {
    public static void main(String[] args)
    {
        int a = exceptionTest();
        System.out.println(a);
    }
    // ִ��˳����ִ��try�飬Ȼ����catch�飬���catch���������return��䣬Ϊ�˱�֤һ��ִ��finally��(�����Ǵ����˳�ϵͳ����䣺System.exit(1)������ִ��finally����catch���return���
    // ���finally���������return��䣬��ֱ�ӷ��أ�����ִ��catch��return��䣬���finally�����治����return��䣬��ֱ�ӷ���ִ��catch��return���
    // ����ִ����finally���Ѿ�return�ˣ�����catch�����return���ᱻִ�е���Ҳ����˵finally��Զ������catch��returnǰ��ִ��
    public static int exceptionTest()
    {
        try{
            FileInputStream fis = new FileInputStream("c:/aa.txt");
        }
        catch(Exception e){
            System.out.println("catch is begin");
            System.exit(1);
            return 1;
        }finally {
            System.out.println("finally is begin");
            return 2;
        }

    }
}
