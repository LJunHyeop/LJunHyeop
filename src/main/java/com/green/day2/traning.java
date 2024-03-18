package com.green.day2;

public class traning {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int result = (int) (Math.random() * 10);
            if (result > 5) {
                System.out.println("help");
            } else if (result == 5) {
                System.out.println("집가고싶어");
            } else {
                System.out.println("집에보내줘");
            }
        }
    }
}


