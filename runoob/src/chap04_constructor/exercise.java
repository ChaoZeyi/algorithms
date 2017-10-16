package chap04_constructor;

import java.util.Scanner;

// 根据输入的值，判断是否能输出对应大小的菱形
public class exercise {
    // 下面是升序的代码
    public void print(int size) {
        for (int i = 1; i <= (size+1)/2; i++) {
            boolean[] flags = new boolean[size];
            if (i == 1)
                flags[(size - 1) / 2] = true;
            else {
                flags[(size - 1) / 2 + (i - 1)] = true;
                flags[(size - 1) / 2 - (i - 1)] = true;
            }
            for (int j = 0; j < flags.length; j++) {
                if (flags[j])
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
        for (int i = (size+1)/2+1; i <= size; i++) {
            boolean[] flags = new boolean[size];
            if (i == size)
                flags[(size - 1) / 2] = true;
            else {
                flags[(size - 1) / 2 + (size - i)] = true;
                flags[(size - 1) / 2 - (size - i)] = true;
            }
            for (int j = 0; j < flags.length; j++) {
                if (flags[j])
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        exercise a = new exercise();
        // 根据行数，判断是否可以组成菱形。如果是奇数行可以输入对应的菱形，如果是偶数行则输出"你输入的数据不能形成菱形结构";
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if(size > 1 && size%2 == 1) {
            a.print(size);
        }else{
            System.out.println("你输入的数据不能形成菱形结构");
        }
    }
}
