package com.green.day13.ch6;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Numbox nb = new Numbox();
        nb.num = 10;
        Numbox nb2 = myCopy(nb);
        System.out.printf(" nb. num : %d\n", nb.num); //10
        System.out.printf(" nb2. num : %d\n", nb2.num); //10

        nb.num = 100;
        System.out.printf(" nb. num : %d\n", nb.num); //100
        System.out.printf(" nb2. num : %d\n", nb2.num); //10
    }

    static Numbox myCopy(Numbox n) {
        Numbox n2 = new Numbox();
        n2.num = n.num;
//        Numbox n2 = n;
        return n2;
    }
}
