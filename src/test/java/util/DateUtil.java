package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import cucumber.api.java.ca.Cal;

public class DateUtil {

    public static Integer getYear(String dateStr){
        String year = dateStr.substring(4);
        return Integer.parseInt(year);
    }

    public static Integer getDay(String dateStr){
        String day = dateStr.substring(0,2);
        return Integer.parseInt(day);
    }

    public static Integer getMonth(String dateStr){
        String month = dateStr.substring(2,4);
        return Integer.parseInt(month);
    }

    public static Integer getCurrentYear(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
       
        return calendar.get(Calendar.YEAR);
    }
    public static Integer getCurrentDay(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(Calendar.DATE);
    }

    public static Integer getCurrentMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(Calendar.MONTH)+1;
    }

    public static String getCurrentMonthName(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.getDisplayName(Calendar.MONTH,Calendar.SHORT,Locale.getDefault());
    }

    public static String getTodayDateInStr(String pattern){
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        Date date = new Date();
        return df.format(date);
    }
	
	public static String addDaysAndGetMonth(Integer daysToAdd){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
		calendar.add(Calendar.DATE,daysToAdd);
        return calendar.getDisplayName(Calendar.MONTH,Calendar.SHORT,Locale.getDefault());
        
    }
	public static int addDaysAndDate(Integer daysToAdd){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
		return calendar.get(calendar.DATE)+7;
        
    }
	public static String getNextMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH,1);
        return calendar.getDisplayName(Calendar.MONTH,Calendar.SHORT,Locale.getDefault());
		
        
    }

    public static Date addDaysToGivenDate(Date date, int numOfDays) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, numOfDays);
        Date nextDate = c.getTime();
        return nextDate;
    }

    public static String getCurrentHour()
    {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        String strhr = dateFormat.format(date);
        return strhr;
    }

    public static String getCurrentAmPm()
    {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("a");
        String strhr = dateFormat.format(date);
        return strhr;
    }

    public static String getCurrentMin()
    {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("mm");
        String strmin = dateFormat.format(date);
        return strmin;
    }
    
   public static int getCurrentYearextraYear()
   {
	   Calendar calendar=Calendar.getInstance();
	   return calendar.get(calendar.YEAR)+1;
   }
    


    public static void main(String[] args) {
        //System.out.println(DateUtil.getTodayDateInStr("dd-MM-yyyy").split("-").);
       /* System.out.println(DateUtil.getCurrentMonthName());
        System.out.println(DateUtil.getCurrentYearextraYear());
     
		
        System.out.println(DateUtil.getNextMonth()); 
        */
      
    }
}
