package com.javastudy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaStudy012 {
    /** 날짜와 시간
     *  Calendar, Date
     *  java.util.Date (JDK 1.0)
     *  - 날짜와 시간을 다룰 목적으로 만들어진 클래스
     *  - Date 메서드는 거의 deprecated 되었지만 여전히 쓰이고 있음
     *  
     *  java.util.Calendar
     *  - Date 클래스를 개선한 새로운 클래스. 단점이 존재한다. (JDK 1.1)
     *  
     *  java.time 패키지
     *  - Date 와 Calendar 의 단점을 개선한 새로운 클래스들을 제공 (JDK 1.8)
     */
    
    public static void main(String[] args) {
        // Calendar >> Date
        Calendar c = Calendar.getInstance();
        Date d = new Date(c.getTimeInMillis()); // Date (long date)
        
        // Date >> Calendar
        Date d2 = new Date();
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);
        
        // Calendar 주요 메서드 (1/3) - get()
        // get() 으로 날짜와 시간 필드 가져오기 - int get(int field)
        Calendar c3 = Calendar.getInstance(); // 현재 날짜와 시간으로 세팅됨
        int thisYear = c3.get(Calendar.YEAR); // 올해가 몇년인지 알아냄
        int lastDayOfMonth = c3.getActualMaximum(Calendar.DATE); // 이 달의 마지막 날
        
        // Calendar 에 정의된 필드
        int o1 = Calendar.YEAR; // 년
        int o2 = Calendar.MONTH; // 월 (0부터 시작) 
        int o3 = Calendar.WEEK_OF_YEAR; // 일
        int o4 = Calendar.WEEK_OF_MONTH; // 그 달의 몇 번째 주
        int o5 = Calendar.DATE; // 일
        int o6 = Calendar.DAY_OF_YEAR; // 그 해의 몇 번째 일
        int o7 = Calendar.DAY_OF_MONTH; //그 달의 몇 번째 일
        int o8 = Calendar.DAY_OF_WEEK; // 요일
        int o9 = Calendar.DAY_OF_WEEK_IN_MONTH; //그 달의 몇 번째 요일
        
        System.out.println(c3.get(o1));
        System.out.println(c3.get(o2) + 1);
        System.out.println(c3.get(o3));
        System.out.println(c3.get(o4));
        System.out.println(c3.get(o5));
        System.out.println(c3.get(o6));
        System.out.println(c3.get(o7));
        System.out.println(c3.get(o8));
        System.out.println(c3.get(o9));
        
        // 현재 시간
        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
        String currentTime1 = format1.format(c2.getTime());
        String currentTIme2 = format1.format(System.currentTimeMillis());
        String currentTIme3 = format1.format(new Date());
        System.out.println(currentTime1);
        System.out.println(currentTIme2);
        System.out.println(currentTIme3);
    }
}