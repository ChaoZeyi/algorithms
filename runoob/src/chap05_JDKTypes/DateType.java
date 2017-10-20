package chap05_JDKTypes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// java.util.Date������װ��ǰ�����ں�ʱ��
public class DateType {
    public static void main(String[] args) throws ParseException {
        //���ֹ��췽����ʹ�õ�ǰ���ں�ʱ������ʼ������
        Date date = new Date();
        //ʹ����1970��1��1����ĺ���������ʼ������
        Date date2 = new Date(100000000L);
        System.out.println(date.getTime());
        System.out.println(date2.toString());
        Date date1 = new Date(99,2,12);
        System.out.println(date1);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String datestr = "2017.05.24 12:35:56";
        Date date4 = sdf.parse(datestr);
        System.out.println(date4);
        Calendar calendar = Calendar.getInstance();//Ĭ����ϵͳ��ǰ����
        System.out.println(calendar.get(Calendar.YEAR));


    }
}
