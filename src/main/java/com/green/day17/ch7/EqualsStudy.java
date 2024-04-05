package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args) {
        Numbox n1 = new Numbox(10);

        Numbox n2 = new Numbox(10);
        System.out.println(n1 == n2);//
        System.out.println(n1.equals(n2));//
        System.out.println(n1.equals(n2));//
    }
}


class Numbox {

    private final int num;

    public Numbox(int num) {
        this.num = num;
    }

    //    @Override
//    public boolean equals(Object obj){
//        Numbox n1 = (Numbox) obj;
//        return  n1.num == num;
//    }
    public boolean equals(Object object) {
        if (!(object instanceof Numbox numbox)) {
            return false;


        }
        return this.num == numbox.num;
    }
}
