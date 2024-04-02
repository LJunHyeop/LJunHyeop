package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5);  // *****(개행)
        star.singlePrint(7); //*******(개행)
        System.out.println("------------");
        star.squarePrint(5);
        star.trianglePrint(4);

        /*
         *
         **
         ***
         ****
         */

        /* ******
         *****
         *****
         *****
         ****** */
    }
}

class Star {

    void singlePrint(int i) {
        for (int z = 0; z < i; z++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void squarePrint(int v) {
        for (int j = 0; j < v; j++) {
            singlePrint(v);
        }
        System.out.println();
    }

    void trianglePrint(int j) {
        for (int k = 1; k <= j; k++) {
            singlePrint(k);
        }
    }
}








