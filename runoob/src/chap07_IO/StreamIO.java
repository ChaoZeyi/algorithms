package chap07_IO;

import java.io.*;

// һ����������Ϊһ���������С����������ڴ�Դ��ȡ���ݣ������������Ŀ��д����
// ����̨�����룺System.in
public class StreamIO {
    public static void main(String[] args) throws IOException {
        int c;
        // ʹ�� System.in ���� BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("�����ַ�, ���� 'q' ���˳���");
        // ��ȡ�ַ�
        do {
            c = br.read();
            System.out.println(c);
        } while (c != 'q');
        //��������Ŀ���ļ�һ��Ҫ���ڣ���Ȼ�ᱨ��
        File file = new File("E:/test.txt");
        InputStream is = new FileInputStream(file);
        byte[] r = new byte[3];
        System.out.println(is.read(r));

        System.out.println();
        //�������Ŀ���ļ���һ��Ҫ���ڣ���������ڵĻ������½�һ��
        OutputStream os = new FileOutputStream(file);
        char bWrite[] = {'1', '2', '3'};
        // ����д
        for (int x = 0; x < bWrite.length; x++) {
            os.write(bWrite[x]);
        }
    }
}
