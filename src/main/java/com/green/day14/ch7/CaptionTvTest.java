package com.green.day14.ch7;

//자식이 부모 보다 더 작아질 수 있나요 ?
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        cTv.channel = 10;
        cTv.power();
        cTv.channelUp();
        cTv.channelDown();
        cTv.channelDown();
        System.out.println("cTv.channel : " + cTv.channel);
        cTv.caption = true;
        cTv.displayCaption("잠온다");
    }
}

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

class VideoTv extends Tv {
    // 위로가면 갈수록 추상적이게 된다.
}

class CaptionTv extends Tv {   // 상속을 받을때 extends Tv 를 쓰면 Tv를 상속받는다 자식이 가진 것은 부모 보다 작아질 수 없다.
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.printf(text);
        }
    }
}
