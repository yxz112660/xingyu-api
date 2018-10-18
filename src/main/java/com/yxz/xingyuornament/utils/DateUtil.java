package com.yxz.xingyuornament.utils;

import com.yxz.xingyuornament.constant.DateConstants;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *  日期处理工具类
 *  @author zhuzhilei
 *  @create_time 2018/7/17
 */
public class DateUtil {

    /**
     * 格式化localDate为日期字符串
     */
    public static String formatLocalDate(LocalDate localDate, String regex){
        return localDate.format(DateTimeFormatter.ofPattern(regex));
    }

    //获取当前时间的指定格式
    public static String formatNow(String pattern) {
        return formatTime(LocalDateTime.now(), pattern);
    }

    /**
     * 时间比较：比较两个时间大小
     *
     * @param
     * @return
     */
    public static Integer timeSize(LocalDateTime localDate2,LocalDateTime localDate3) {
        if (localDate2.isAfter(localDate3)) {
            return 1;   //当前时间在设定的时间之后
        } else if (localDate2.isBefore(localDate3)) {
            return -1;  //当前时间在设定的时间之前
        } else {//相等
            return 0;
        }
    }

    /**
     * 解析日期时间字符串为LocalDate
     */
    public static LocalDateTime parseAnalyze(String str, String regex){
        return LocalDateTime.parse(str, DateTimeFormatter.ofPattern(regex));
    }

    // 计算两个日期相差天数
    public static int diffDays(LocalDateTime date1, LocalDateTime date2) {
        LocalDate d1 = date1.toLocalDate();
        LocalDate d2 = date2.toLocalDate();
        return (int) (d1.toEpochDay() - d2.toEpochDay());
    }

    //LocalDateTime转换为Date
    public static Date convertLDTToDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
    }

    //Date转换为LocalDateTime
    public static LocalDateTime convertDateToLDT(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * 格式化LocalDate日期
     */
    public static String formatLocal(LocalDate localDate, String regex) {
        if (localDate == null) {
            return LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern(regex));  //当前日期前一天
        } else {
            return localDate.format(DateTimeFormatter.ofPattern(regex));
        }
    }

    /**
     * 格式化LocalDateTime日期时间字符串
     */
    public static String formatRegex(LocalDateTime localDate, String regex) {
        if (localDate == null) {
            return LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern(regex));  //当前日期前一天
        } else {
            return localDate.format(DateTimeFormatter.ofPattern(regex));
        }
    }

    //获取指定时间的指定格式
    public static String formatTime(LocalDateTime time,String pattern) {
        return time.format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 解析日期时间字符串为LocalDateTime
     */
    public static LocalDateTime formatLocalDateTime(String str, String regex){
        return LocalDateTime.parse(str, DateTimeFormatter.ofPattern(regex));
    }


    /**
     *秒转分钟,分钟转小时
     * */
    public static Float secondToMinute(int second) {
        DecimalFormat df = new DecimalFormat("0.00");//保留两位位小数
        String s = df.format((float)second/60);
        return Float.parseFloat(s);
    }



    /**
     * 日期字符串的格式化转换
     *
     * @param date
     * @param pattern
     * @return
     */
    public static Date parseDate(String date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 日期格式化
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String formatDate(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        if (date == null) {
            date = getPrevDay(new Date());
        }
        return sdf.format(date);
    }

    /**
     * 获取当前日期date的前一天
     *
     * @param date
     * @return
     */
    public static Date getPrevDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    /**
     * 字符串转换成日期
     * @param str
     * @return date
     */
    public static Date StrToDate(String str,String pattern) {

        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    /**
     * 时间加n分钟
     *
     * @param
     * @return
     */
    public static Date timeAdd(Date time,Integer n) {

        Calendar calendar=new GregorianCalendar();
        calendar.setTime(time);
        calendar.add(Calendar.MINUTE,n);
        return calendar.getTime();
    }

    /**
     * 去掉有T的时间的T
     * @param str
     * @return date
     */
    public static String StrToStr(String str) {
        SimpleDateFormat format = new SimpleDateFormat(DateConstants.SLEEP_DATA_TIME_PATTERN);
        Date date=null;
        String time="";
        try {
            date = format.parse(str);
            SimpleDateFormat sdf =new SimpleDateFormat(DateConstants.DATE_TIME_PATTERN);
            time =sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    /**
     * generateTimestamp：的功能描述: 生成接口所需的时间戳
     * @param
     * @return 秒数
     */
    public static String generateTimestamp() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    //获取指定日期的秒
    public static String generateTimesp(LocalDateTime date) {
        return String.valueOf(date.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond());
    }

    /**
     * 将时间戳转为日期字符串
     *
     * @param time:
     * @param pattern
     * @return
     */
    public static String dateTimestamp(String time, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Timestamp ts = new Timestamp(Long.parseLong(time) * 1000);
        return sdf.format(ts);
    }

    /**
     * 获取date的第几天
     *
     * @param date
     * @param pattern
     * @param days
     * @return
     */
    public static String getNextDay(LocalDateTime date, String pattern, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(convertLDTToDate(date));
        cal.add(Calendar.DAY_OF_MONTH, days);
        Date nextDay = cal.getTime();
        return formatTime(convertDateToLDT(nextDay), pattern);
    }

    //日期减去一个数,根据field不同减不同值,field参数为ChronoUnit.*
    public static LocalDateTime minu(LocalDateTime time, long number, TemporalUnit field){
        return time.minus(number,field);
    }

}
