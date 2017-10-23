package chap07_IO;

import java.io.*;

// 一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据
// 控制台的输入：System.in
public class StreamIO {
    public static void main(String[] args) throws IOException {
        int c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = br.read();
            System.out.println(c);
        } while (c != 'q');
        //输入流的目标文件一定要存在，不然会报错
        File file = new File("E:/test.txt");
        InputStream is = new FileInputStream(file);
        byte[] r = new byte[3];
        System.out.println(is.read(r));

        System.out.println();
        //输出流的目标文件不一定要存在，如果不存在的话，则新建一个
        OutputStream os = new FileOutputStream(file);
        char bWrite[] = {'1', '2', '3'};
        // 覆盖写
        for (int x = 0; x < bWrite.length; x++) {
            os.write(bWrite[x]);
        }
    }
}
