package com.green.day19.blackjack;

public class Card {
    private final String pattern;  // 무늬 Spade
    private final String denomination; // A 2~10 JQK

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getDenomination() {
        return this.denomination;
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", pattern, denomination);
    }

    public int getScore() {
        return switch (denomination) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }
}


class CardTest {
    public static void main(String[] args) {
        Card c = new Card("Spade", "A");
        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c);// Spade (A)  //객체가 넘어오면 돌아올 수 있는 콘솔을 달라고 한다.

        int score = c.getScore();

    }
}


//public void setPattern(String pattern){
//        this.pattern = pattern;
//
//    }
//    public void setDenomination(String denomination){
//        this.denomination=denomination;
//    }