package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printAllCard();
        Card c = deck.pick();
        System.out.println("----------");
        deck.sf();
        Card c2 = deck.pick(5);
        System.out.println("[5] : " + c2);
        deck.printAllCard();
        System.out.println("----------");
        deck.shuffle();

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
                Card card = new Card(kind[i], number[z]);
                cards[idx++] = card;
            }
        }

    }

    public Card pick() {
        Card i;
        int rind = (int) (Math.random() * cards.length);
        i = cards[rind];
        cards[rind] = null;
//        System.out.println("------------");
//        System.out.println(i);
        return i;

    }

    Card pick(int i) {
        Card v = cards[i];
        return v;
    }

    void shuffle() {
        int idex = 0;
        String[] kinds = {"Clover", "Heart", "Spade", "Diamond"};
        int rind = (int) (Math.random() * cards.length);
        for (int i = 0; i < kinds.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String number = switch (z) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                Card card = new Card(kinds[i], number);
                card = cards[rind];


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

    Card(String kind, String number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }
}

