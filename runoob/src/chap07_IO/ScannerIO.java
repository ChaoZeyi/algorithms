package chap07_IO;

import java.util.Scanner;

//������ȡ�û�������
public class ScannerIO {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //System.out.println();
        //��������Ч�ַ�֮ǰ�����Ŀհף�next() �������Զ�����ȥ��,ֻ��������Ч�ַ���Ž����������Ŀհ���Ϊ�ָ������߽�������
        ScannerDataError();
        while(scanner.hasNext())
        {
            System.out.println("���������Ϊ��"+scanner.next());
        }
        // ��EnterΪ������,Ҳ����˵ nextLine()�������ص�������س�֮ǰ�������ַ������Ի�ÿհס�
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
            System.out.println("�������");
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
            System.out.println("�������");
            return;
        }
        StringBuffer str = new StringBuffer("");
        for(int i=0;i<num;++i) {
            if (scanner.hasNextLine()) {
                System.out.println("�Ƿ�����һ�У�"+scanner.hasNextLine());
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
