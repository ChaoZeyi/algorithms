package chap05_JDKTypes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// java.util.Date类来封装当前的日期和时间
public class DateType {
    public static void main(String[] args) throws ParseException {
        //两种构造方法，使用当前日期和时间来初始化对象
        Date date = new Date();
        //使用自1970年1月1日起的毫秒数来初始化对象
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
        Calendar calendar = Calendar.getInstance();//默认是系统当前日期
        System.out.println(calendar.get(Calendar.YEAR));


    }
}
