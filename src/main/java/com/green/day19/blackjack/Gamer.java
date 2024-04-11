package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {

    protected List<Card> cards;

    public Gamer() {
        cards = new ArrayList<>();
    }

    public void receivedCard(Card String) {
        cards.add(String);
        System.out.println(String);
    }

    public List<Card> openCards() {
        return cards;
    }

    public int getScore() {
        int sum = 0;
        for (int i = 0; i < cards.size(); i++) {
            sum += cards.get(i).getScore();
        }
        return sum;
    }
}

class GamerTest {
    public static void main(String[] args) {

        Gamer gamer = new Gamer();
        gamer.receivedCard(new Card("스페이드", "9"));
        gamer.receivedCard(new Card("하트", "2"));

        List<Card> cards = gamer.openCards();
    }
}
