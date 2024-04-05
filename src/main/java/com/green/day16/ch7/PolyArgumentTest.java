package com.green.day16.ch7;

//    public void setPrice(int price){
//
//        this.price = price;
//    }
//    public  void setBonusPoint(int bonusPoint){
//        this.bonusPoint = bonusPoint;
//    }
//Tv Price : 100 bonusPoint : 10
//        Product p = new Product(1000);
//        System.out.printf(" price : %d  , bonusPoint : %d\n",p.getPrice(),p.getBonusPoint());
//        System.out.println(p);
//        Product p2 = new Product(500);
//        System.out.printf(" price : %d  , bonusPoint : %d\n",p2.getPrice(),p2.getBonusPoint());
/*
        Tv tv = new Tv();
        System.out.println(tv);
        Computer computer = new Computer();
        System.out.println(computer);
        */
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Computer());
        System.out.println(buyer);
        buyer.buy(new Sofa());
        System.out.println(buyer);
//        buyer.showMeTheMoney();
    }
}

class Buyer {
    private int haveMoney;
    private int haveBonusPoint;

    public Buyer(int haveMoney) {
        this.haveMoney = haveMoney;
    }

    public int getHaveMoney() {
        return haveMoney;
    }

    public void buy(Product product) {
        haveMoney -= product.getPrice();
        haveBonusPoint += product.getBonusPoint();
        System.out.printf("%s를 구매하였습니다\n", product);
    }

    public String toString() {
        return String.format("haveMoney : %s haveBonusPoint : %s", haveMoney, haveBonusPoint);
    }

    void buyer() {

    }
}


class Sofa extends Product {
    Sofa() {
        super(80);
    }

    public String toString() {
        return String.format("sofa %s", super.toString());
    }
}

class Computer extends Product {
    Computer() {
        super(200);

    }

    public String toString() {
        return String.format("Computer %s", super.toString());
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return String.format("TV %s", super.toString());
    }
}

class Product {
    private final int price;
    private final int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = price / 10;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public String toString() {
        return String.format("Price : %d bonusPoint : %d", price, bonusPoint);
    }

}

