package com.green.day16.ch7;


public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 11, 12);
        System.out.printf("hour : %d\n", time.getHour());
        time.setHour(22);
        System.out.printf("hour : %d\n", time.getHour());
//        Time.hour = 10;
    }
}

class Time { // 캡술화 은닉화 갚을 넣는방법 1가지 뺴는방법 2가지 중요한개념  상수는 은닉화를 하지않아도 된다
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


//    public  void setHour(int hour){
//        this.hour= hour;
//    }
//    public void setMinute(int minute){
//        this.minute= minute;
//
//    }
//    public void setSecond(int second){
//        this.second= second;
//    }
//
//    public int getHour(){
//        return  hour;
//    }
//    public int getMinute(){
//        return  minute;
//
//    }
//    public int getSecond(){
//        return  second;
//    }
}

