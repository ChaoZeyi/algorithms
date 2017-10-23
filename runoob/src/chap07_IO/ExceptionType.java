package chap07_IO;

import java.io.FileInputStream;
//catch 不能独立于 try 存在。
//在 try/catch 后面添加 finally 块并非强制性要求的。
//try, catch, finally 块之间不能添加任何代码。
public class ExceptionType {
    public static void main(String[] args)
    {
        int a = exceptionTest();
        System.out.println(a);
    }
    // 执行顺序：先执行try块，然后是catch块，如果catch块里面存在return语句，为了保证一定执行finally块(除非是存在退出系统的语句：System.exit(1)），先执行finally块再catch块的return语句
    // 如果finally块里面存在return语句，则直接返回，不再执行catch的return语句，如果finally块里面不存在return语句，则直接返回执行catch的return语句
    // 就是执行了finally后已经return了，所以catch里面的return不会被执行到。也就是说finally永远都会在catch的return前被执行
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
