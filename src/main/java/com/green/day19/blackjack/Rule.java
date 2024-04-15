package com.green.day19.blackjack;

public class Rule {
    void WhoIsWinner(Gamer gamer, Dealer dealer) {
        final int MAX_SCORE = 21;
        int dealerScroe = 0;
        int gamerScroe = 0;
        for (int i = 0; i < gamer.openCards().size(); i++) {
            gamerScroe += gamer.openCards().get(i).getScore();
        }
        for (int z = 0; z < dealer.openCards().size(); z++) {
            dealerScroe += dealer.openCards().get(z).getScore();
        }
//        int gamerScroe = gamer.getScore();
//        int dealerScroe = dealer.getScore();
        if (gamerScroe > MAX_SCORE && dealerScroe > MAX_SCORE || gamerScroe == dealerScroe) {
            System.out.println("비겼습니다 ");


        } else if (gamerScroe < dealerScroe && dealerScroe <= MAX_SCORE || gamerScroe > MAX_SCORE) {
            System.out.println("딜러가 이겼습니다");
        } else {
            System.out.println("게이머가 이겼습니다.");
        }
        System.out.println("gamer :" + gamerScroe);
        System.out.println("dealer: " + dealerScroe);
        System.out.println(gamer.openCards());
        System.out.println(dealer.openCards());


    }
}
