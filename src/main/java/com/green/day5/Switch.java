package com.green.day5;

public class Switch {
    public static void main(String[] args) {
        int mon = (int) (Math.random() * 12.0) + 1;
        switch (mon) {
            default:
                System.out.println("잘못된값입니다.");
                break;
            //11 12 1 겨울 2,3,4 봄 5,6,7,여름 8,9,10,가을
            case 11:
            case 12:
            case 1:
                System.out.println("겨울");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("봄");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("여름");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("가을");
                break;
        }
        System.out.println(mon);
    }
}
