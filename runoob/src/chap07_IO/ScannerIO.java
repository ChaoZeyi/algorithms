package chap07_IO;

import java.util.Scanner;

//用来获取用户的输入
public class ScannerIO {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //System.out.println();
        //对输入有效字符之前遇到的空白，next() 方法会自动将其去掉,只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
        ScannerDataError();
        while(scanner.hasNext())
        {
            System.out.println("输入的数据为："+scanner.next());
        }
        // 以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。可以获得空白。
        while(scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }
    }
    public static void ScannerData() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        if(scanner.hasNextInt())
            num = scanner.nextInt();
        else
        {
            System.out.println("输入错误");
            return;
        }
        StringBuffer str = new StringBuffer("");
        for(int i=0;i<num;++i) {
            if (scanner.hasNext()) {
                str.append(scanner.next());
            }
            else
            {
                System.out.println("no next");
            }
        }
        System.out.println(str);
    }

    public static void ScannerDataError() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        if(scanner.hasNextInt())
            num = scanner.nextInt();
        else
        {
            System.out.println("输入错误");
            return;
        }
        StringBuffer str = new StringBuffer("");
        for(int i=0;i<num;++i) {
            if (scanner.hasNextLine()) {
                System.out.println("是否有下一行："+scanner.hasNextLine());
                str.append(scanner.next());
            }
            else
            {
                System.out.println("no next");
            }
        }
        System.out.println(str);
    }
}
