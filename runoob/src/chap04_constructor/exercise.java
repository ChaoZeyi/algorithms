package chap04_constructor;

import java.util.Scanner;

// ���������ֵ���ж��Ƿ��������Ӧ��С������
public class exercise {
    // ����������Ĵ���
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
        // �����������ж��Ƿ����������Ρ�����������п��������Ӧ�����Σ������ż���������"����������ݲ����γ����νṹ";
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if(size > 1 && size%2 == 1) {
            a.print(size);
        }else{
            System.out.println("����������ݲ����γ����νṹ");
        }
    }
}
