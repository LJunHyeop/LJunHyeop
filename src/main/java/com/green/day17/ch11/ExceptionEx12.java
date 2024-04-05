package com.green.day17.ch11;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
//        div(10,0);
//        divTry(10,0);
//        try {
//            divThrows(10,2);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        divThrows(10, 2);
        System.out.println("===종료===");
    }


    public static void div(int n1, int n2) {  // static 가 붙냐 안붙냐는 차이가없다
        System.out.println(n1 / n2);
    }

    public static void divTry(int n1, int n2) {
        try {
            System.out.println(n1 / n2);
        } catch (Exception e) {
            System.out.println("0으로 나누면 안되요 ");
        }
    }

    public static void divThrows(int n1, int n2) throws Exception {  // static 가 붙냐 안붙냐는 차이가없다 예외 발생시 던질꺼야 나몰라라 여기서 처리안해
        System.out.println(n1 / n2);
    }
}
