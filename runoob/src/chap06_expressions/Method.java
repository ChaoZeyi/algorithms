package chap06_expressions;

public class Method {
    //方法的重载：方法名相同，但参数列表不同,跟访问控制符和返回类型没有关系
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static void main(String[] args)
    {
        int i = max(2, 3);
        double d = max(2.3, 2.4);
        for(int j=0; j<args.length; j++){
            System.out.println("args[" + j + "]: " +
                    args[j]);
        }
    }
}
