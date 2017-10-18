package java;


import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abhishek.Sehgal
 */
public class NewClass {

    private int day, hour, minute, second;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String time = "09:00:00";
        NewClass newClass = new NewClass();
        newClass.getUtilization(new Date(2017, 9, 16, 20, 30, 0), new Date());
        System.out.println("" + new Date(2017, 9, 16, 20, 30, 0));
        System.out.println("Day - " + newClass.getDay());
        System.out.println("Hour - " + newClass.getHour());
        System.out.println("Minute - " + newClass.getMinute());
        System.out.println("Second - " + newClass.getSecond());
        
    }

    public void getUtilization(Date start, Date end) {
        int diff = (int) (end.getTime() - start.getTime());
        setDay((((diff / 1000) / 60) / 60) / 24);
        setHour(((diff / 1000) / 60) / 60);
        setMinute((diff / 1000) / 60);
        setSecond(diff / 1000);
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setSecond(int second) {
        this.second = second;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public int getHour() {
        return hour;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public void setMinute(int minute) {
        this.minute = minute;
    }
    
}