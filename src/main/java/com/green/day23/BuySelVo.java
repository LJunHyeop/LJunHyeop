package com.green.day23;

public class BuySelVo {

    private final String memId;
    private final int buyCount;


    public BuySelVo(String memId, int buyCount) {
        this.buyCount = buyCount;
        this.memId = memId;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public String getMemId() {
        return memId;
    }

    @Override
    public String toString() {
        return "BuySelVo{" +
                "memId='" + memId + '\'' +
                ", buyCount=" + buyCount +
                '}';
    }

}


