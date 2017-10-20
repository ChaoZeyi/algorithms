package chap05_JDKTypes;

import java.util.Arrays;

// 数组类型，用于存储固定大小的同类型数据
// 引用对象都是不可变类型，比如数组和String，对于数组test1 test2，执行test1=test2，是把test2的地址赋给了test1
// 而根据下标修改值，如test1[1]=100,是因为int类型是可变的，跟数组类型没有关系
// java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的
// 数组不是一个对象，因为没有数组这个类型，只能说是一个数据结构，求数组的大小用的是.length,没有（），可以理解为只有对象才存在方法
// String是一个对象，求String的大小用的是.length（)方法，求List的大小用的是.size()方法
public class ArrayType {
    public static void main(String[] args)
    {
        //声明数组
        int[] nums;
        //创建数组
        nums = new int[10];
        //数组初始化
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
        // 这两种赋值方法效果是一样的
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
        // 把num2指向了函数返回值的地址
        System.out.println(nums2);
        String str = "helloworld";
        char[] data = str.toCharArray();// 将字符串转为数组
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
