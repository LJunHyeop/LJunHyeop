package com.green.day27.nonioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HarmanSpeaker implements Speaker {
    private final Woofer woofer;

    public HarmanSpeaker() {
        woofer = new HanilWoofer();
    }

    @Override
    public void sound() {
        System.out.println(" HarMan Speaker : 소리가 웅장하다");
        woofer.soundBase();
    }
}
