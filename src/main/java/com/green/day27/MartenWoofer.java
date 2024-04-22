package com.green.day27;

public class MartenWoofer implements Woofer {

    private Woofer woofer;

    //생성자, 클래스명 똑같고 리턴타입없고


    @Override
    public void soundBase() {
        System.out.println("Marten Woofer 가 웅 웅 웅 웅 ");
    }


}
