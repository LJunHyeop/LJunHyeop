package com.green.day19.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16;// 16이하면 카드 한장더 가져올꺼야

    public boolean isMoreReceiveCard() {
        int sum = 0;
        for (int i = 0; i < cards.size(); i++) {
            sum += cards.get(i).getScore();
        }
        return sum <= CAN_RECEIVE_POINT;
    }
}


class DealerTest {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.receivedCard(new Card("Spade", "A"));
        dealer.receivedCard(new Card("Spade", "K"));
        boolean answer = dealer.isMoreReceiveCard();
        System.out.println(answer);
    }

}

