package com.green.day11.ch6;

public class Tv {
    String color;   //객체 입장 문자열을 저장하는 곳 color :  의미부여 한것
    boolean power;
    int channel;

    void power() {
        power = !power; // toggle 처리 켜고 끄기
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}
