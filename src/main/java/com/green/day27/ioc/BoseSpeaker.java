package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class BoseSpeaker implements Speaker {

    private final Woofer woofer;

    public BoseSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void sound() {
        System.out.println("Bose Speaker : 소리가 짱짱하다");
        woofer.soundBase();

    }
}
