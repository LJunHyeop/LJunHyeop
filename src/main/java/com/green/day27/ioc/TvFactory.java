package com.green.day27.ioc;

import com.green.day27.MartenWoofer;
import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;
import com.green.day27.nonioc.HanilWoofer;

public class TvFactory {
    //SingleTon
    private static TvFactory tvFactory;

    private TvFactory() {

    }

    public static TvFactory getInstance() {
        if (tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    public Tv factory(String tvName, String speakerName, String wooferName) {
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;

        };
        Speaker speaker = switch (speakerName) {
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };
        Tv tv = switch (tvName) {
            case "lg" -> new LgTv(speaker);
            case "apple" -> new AppleTv(speaker);
            default -> null;
        };
        return tv;
    }
}
