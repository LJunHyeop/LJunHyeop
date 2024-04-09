package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"Spade", "Heart", "Diamond", "Clover"};
    public static final String[] Denomination = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public static final int CARD_COUNT = 13;

    private final List<Card> cards;

    public CardDeck() {
        cards = new ArrayList();
        for (int i = 0; i < PATTERNS.length; i++) {
            for (int j = 0; j < CARD_COUNT; j++) {
                Card c = new Card(PATTERNS[i], Denomination[j]);
                cards.add(c);
            }
        }
    }

    public Card draw() {
        int num = (int) (Math.random() * cards.size());
        /*Card card = list.get(num);*/
        return cards.remove(num);
    }

    public void showCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }
}

class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //기본생성자에서 PATTERNS, CARD_COUNT 를 활용하여
        //52장의 카드 객체를 생성하여 list 에 추가하면된다.
        Card c = cd.draw(); // 랜덤한 카드 객체 주소값 리턴
        System.out.println(c);
        System.out.println(cd.draw());
        System.out.println("=========");
        cd.showCards();
    }
}


//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//    public String getdenomination(int num){
//        return switch (num) {
//            case 1 -> "A";
//            case 11 -> "J";
//            case 12 -> "Q";
//            case 13 -> "K";
//            default -> String.valueOf(num);
//        };
//    }
