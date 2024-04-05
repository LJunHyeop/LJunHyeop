package com.green.day16.ch7;

public interface PlayingCard {
    //public static final 자동적으로 붙음

    int CLOVER = 1;

    //public abstract  자동적으로 붙음
    String getCardNumber();


}

interface DeepPlayingCard extends PlayingCard { // extends 는 무조건 class 만 상속
    String getCardKind();
}

class PlayCardSecond implements PlayingCard {
    public String getCardNumber() {
        return null;
    }
}

class PlayCard implements DeepPlayingCard {
    @Override
    public String getCardNumber() {
        return null;
    }

    public String getCardKind() {
        return null;
    }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard) pc;
        dpc.getCardKind();
        System.out.println("--------END-----------");
    }
}