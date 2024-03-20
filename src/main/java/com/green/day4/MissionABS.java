package com.green.day4;

public class MissionABS {
    public static void main(String[] args) {
        int val = (int) (Math.random() * 21) - 10;
        System.out.println("원본 : " + val);// 0~20 > -10 ~10 음수가나오면 양수 양수가 나오면 양수
        //if(val <0) val = -val
        /*if(val <=0){
            System.out.println("결과값: "+ val * -1);
        }else{
            System.out.println("결과값: "+val);*
        }*/
        //방법 3 System.out.println"결과값" +( val <0 ? =avl : val));
    }
}
