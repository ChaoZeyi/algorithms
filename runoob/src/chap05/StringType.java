package chap05;
//String类是不可变的,如果需要改变就可以用StringBuffer和StringBuilder类型
//基本类型的包装类也是不可变的
//StringBuffer 线程安全 StringBuilder 线程不安全
//StringBuilder 速度快
public class StringType {
    public static String addTest(String s) {
        s = s + "11";
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String a = "runoob";
        StringType.addTest(a);
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            new CustomThread(buffer, builder).start();
        }
        ;

    }
}
 class CustomThread extends Thread {
        private StringBuffer buffer;
        private StringBuilder builder;

        public CustomThread(StringBuffer buffer, StringBuilder builder) {
            this.buffer = buffer;
            this.builder = builder;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                buffer.append("A");
                builder.append("Z");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("StringBuffer Size:" + buffer.length()
                    + " | "
                    + "StringBuilder Size:" + builder.length());
        }
 }