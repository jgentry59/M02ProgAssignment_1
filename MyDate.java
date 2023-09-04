import java.util.*;
public class MyDate {
    private int year;            
    private int month;        //declaring variables year, month, and day as int
    private int day;

    public MyDate() 
    
    {
        Calendar calendar = Calendar.getInstance();   //makes a calendar instance to get the date/time

        
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);     //updates calendar data
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) 
    {
        
        Calendar calendar = new GregorianCalendar();   //makes a calendar instance using Gregorian Calendar
        calendar.setTimeInMillis(elapsedTime);         //set its time based on elapsed milliseconds

        
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);     //updates calendar data again
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() //gets year value for MyDate
    {
        return year;
    }

    public int getMonth() //gets month value for MyDate
    {
        return month;
    }

    public int getDay()   //gets day value for MyDate
    {
        return day;
    }

    public void setDate(long elapsedTime) 
    {
        
        Calendar calendar = new GregorianCalendar();   // makes calendar instance using Gregorian Calendar
        calendar.setTimeInMillis(elapsedTime);         //set its time based on milliseconds passed
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);     //updates calendar data
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date 1: Year = " + date1.getYear() + ", Month = " + date1.getMonth() + ", Day = " + date1.getDay());
        System.out.println("Date 2: Year = " + date2.getYear() + ", Month = " + date2.getMonth() + ", Day = " + date2.getDay());
    }
}
