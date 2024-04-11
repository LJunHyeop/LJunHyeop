package com.green.day19.blackjack;

import java.util.Scanner;

public class Game {


    public static final int INIT_RECEIVE_CARD_COUNT = 2;

    public void play() {
        System.out.println("=======BlackJack========");
        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        initPhase(cardDeck, gamer, dealer);

        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            Card c = cardDeck.draw();
            gamer.receivedCard(c);

            Card c2 = cardDeck.draw();
            dealer.receivedCard(c2);
//                dealer.receivedCard(cardDeck.draw());
//            dealer.receivedCard(cardDeck.draw());
//            gamer.receivedCard(cardDeck.draw());
        }
// 딜러가 16점 이하면 카드한장 더 받을 수 있도록 처리

        while (dealer.isMoreReceiveCard()) {
            System.out.println("한장더 뽑자");
            Card c3 = cardDeck.draw();
            dealer.receivedCard(c3);
        }


        System.out.println("gamer" + gamer.openCards());
        System.out.println("dealer" + dealer.openCards());

        playingPhase(cardDeck, gamer, dealer);
        //initPhase(cardDeck, gamer,dealer);

        rule.WhoIsWinner(gamer, dealer);
    }

    private void playingPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        Scanner scan = new Scanner(System.in);
        System.out.println(gamer.openCards());

        while (true) {
            System.out.print("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요 >>  ");
            String input = scan.next();
            if ("0".equals(input)) {
                System.out.println("==종료==");
                break;
            } else {
                Card c4 = cardDeck.draw();
                gamer.receivedCard(c4);
            }
            System.out.println(gamer.openCards());
        }
        //게이머가 0을 입력할 때 까지 카드를 뽑는다. (게이머가 카드 객체 주소값 추가 ,로 저장)
        scan.close();
    }


    private void initPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
    }
}
