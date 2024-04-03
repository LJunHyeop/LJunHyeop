package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printAllCard();
        deck.sf();
        deck.printAllCard();
//        Card c = new Card();
//        c.kind = "Spade";
//        c.number = "A";
//        System.out.printf(" kind : %s, number: %s\n",c.kind,c.number);
//
//        System.out.println(c);

        // Object 는 모든 객체를 담을 수 있다.
    }
}

class Deck {
    static final String[] kinds = {"Clover", "Heart", "Spade", "Diamond"};
    int CARD_NUM;
    Card[] cards;

    /*Card[] Cards = new Card[CARD_NUM];*/
    Deck() {
        CARD_NUM = 52;
        cards = new Card[CARD_NUM];
        int idx = 0;
        String[] kind = {"Clover", "Heart", "Spade", "Diamond"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < kind.length; i++) {
            for (int z = 0; z < number.length; z++) {
                Card card = new Card();
                cards[idx++] = card;
                card.kind = kind[i];
                card.number = number[z];

            }
        }


    }

    void sf() {
        Card temp;
        for (int i = 0; i < cards.length; i++) {
            int ramdomidex = (int) (Math.random() * cards.length);
            temp = cards[i];
            this.cards[i] = this.cards[ramdomidex];
            this.cards[ramdomidex] = temp;
        }

    }

    void printAllCard() {
        for (Card c : cards) {
            System.out.println(c);
        }

    }
}


class Card {
    String kind; // 무늬
    String number; // 번호 A 2~10,J,Q,K

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }
}

