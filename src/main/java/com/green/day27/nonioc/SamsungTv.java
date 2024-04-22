package com.green.day27.nonioc;


import com.green.day27.Speaker;
import com.green.day27.Tv;

public class SamsungTv implements Tv {

    private final Speaker speaker;

    public SamsungTv() {
        //this.speaker = new HarmanSpeaker();
        this.speaker = new JblSpekaer(); // 사용하자고하는 코드를 바꿀려고하면 무조건 수정해야한다 . nonioc 의 단점
    }

    @Override
    public void sound() {
        System.out.println(" Samsung Tv : 소리가 난다");
        speaker.sound();
    }
}
