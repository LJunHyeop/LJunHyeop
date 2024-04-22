package com.green.day27.ioc;

import com.green.day27.Tv;

public class TvTest {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        String tvName = "lg";
        String speakerName = "genelec";
        String wooferName = "hanil";
        Tv tv = tvFactory.factory(tvName, speakerName, wooferName);
        tv.sound();

    }
}
