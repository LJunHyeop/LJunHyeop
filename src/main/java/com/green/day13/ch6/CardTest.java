package com.green.day13.ch6;

public class CardTest {
    public static void main(String[] args) {
        /*
        무슨 수를 써서라도 카드 객체를 만들어낸다 52장 모양 clover ,heart ,diamond, spade 숫자 A ~ 10 J Q K
         */
        Card abc = new Card();
        Card[] cards = new Card[52];
        String[] num = {"A,1,2,3,4,5,6,7,8,9,10,J,Q,K"};
        String[] shape = {"clover", "heart", "diamond", "spade"};
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < num.length; j++) {
                Card card = new Card();
            }
        }
    }
}
