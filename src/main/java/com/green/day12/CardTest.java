package com.green.day12;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card.width = 110;
        System.out.println(Card.width);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        Card.width = 200;

        System.out.printf("c1. kind : %s c1.number : %d \n", c1.kind, c1.number);
        System.out.printf("c2. kind : %s c2.number : %d \n", c2.kind, c2.number);


        System.out.println(Card.width); // 사용은되나 지양
        System.out.println(Card.height); // 사용은되나 지양
        System.out.println("Card . width : " + Card.width); // 사용은되나 지양

    }
}
