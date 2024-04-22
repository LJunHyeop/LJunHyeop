package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class GenelecSpeaker implements Speaker {

    private final Woofer woofer;

    public GenelecSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void sound() {
        System.out.println("Genelec Speaker : 소리가 굉장해엄청하다");
        woofer.soundBase();

    }
}
