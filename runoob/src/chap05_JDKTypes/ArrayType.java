package chap05_JDKTypes;

import java.util.Arrays;

// �������ͣ����ڴ洢�̶���С��ͬ��������
// ���ö����ǲ��ɱ����ͣ����������String����������test1 test2��ִ��test1=test2���ǰ�test2�ĵ�ַ������test1
// �������±��޸�ֵ����test1[1]=100,����Ϊint�����ǿɱ�ģ�����������û�й�ϵ
// java.util.Arrays ���ܷ���ز������飬���ṩ�����з������Ǿ�̬��
// ���鲻��һ��������Ϊû������������ͣ�ֻ��˵��һ�����ݽṹ��������Ĵ�С�õ���.length,û�У������������Ϊֻ�ж���Ŵ��ڷ���
// String��һ��������String�Ĵ�С�õ���.length��)��������List�Ĵ�С�õ���.size()����
public class ArrayType {
    public static void main(String[] args)
    {
        //��������
        int[] nums;
        //��������
        nums = new int[10];
        //�����ʼ��
        int[] nums2 = {1, 2, 3, 4};
        nums2[1] = 10;
        System.out.println(nums2[1]);
        System.out.println(nums[1]);
        int[] nums3 = new int[]{1,2,3};
        for (int num : nums3) {
            System.out.println(num);
        }
        printArray(new int[]{1, 2, 3});

        String s[][] = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        // �����ָ�ֵ����Ч����һ����
        s[0][0] ="Good";
        s[0][1] = "Luck";
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        System.out.println(s[0][1]);
        System.out.println(Arrays.binarySearch(nums2, 1));
        Arrays.sort(nums2);
        printArray(nums2);
        System.out.println(nums2);
        nums2 = reverse(nums2);
        // ��num2ָ���˺�������ֵ�ĵ�ַ
        System.out.println(nums2);
        String str = "helloworld";
        char[] data = str.toCharArray();// ���ַ���תΪ����
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + "  ");
            data[x] -= 32;
            System.out.print(data[x] + "  ");
        }
        System.out.println(new String(data));
        String str2 = "aa";
        str2 = "bb";
        System.out.println(str2);

    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0,j=result.length-1; i < arr.length; i++,j--) {
            result[j] = arr[i];
        }
        System.out.println(result);
        return result;
    }
}
