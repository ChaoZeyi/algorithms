package chap05;
//String���ǲ��ɱ��,�����Ҫ�ı�Ϳ�����StringBuffer��StringBuilder����
//�������͵İ�װ��Ҳ�ǲ��ɱ��
//StringBuffer �̰߳�ȫ StringBuilder �̲߳���ȫ
//StringBuilder �ٶȿ�
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