package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args) {
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L; // 리터럴 정수는 int 타입, long 리터럴로 변경하려면 l,L을 붙이면된다.
        System.out.println(big);

        System.out.printf("c=%c,%d\n", c, (int) c);
        System.out.printf("finger=[%5d]\n", finger); // \n or %n을 씀
        System.out.printf("finger=[%-5d]\n", finger);
        System.out.printf("finger=[%05d]\n", finger);
        System.out.printf("big=%d\n", big);
        System.out.println(big);
        // 값을을 이용해서 yyyy-mm-dd를 하고싶은것
        int year = 2024;
        int mon = 3;
        int day = 20;
        System.out.printf("[%4d-%02d-%02d]\n", year, mon, day);

        String url = "www.green.com";
        float f1 = .10f;//0.10f랑 동일, 리터럴 실수는 double 타입이기 때문에 , 끝에 f or F를 붙이면 float 타입의 리터럴이됨
        double d = 1.23456789;

        System.out.printf("url=%s\n", url);
        System.out.printf("f=%f\n", f1);
        System.out.printf("d=%f\n", d);
        System.out.printf("d=%.2f\n", d);//반올림 처리되서 5가 되면 1.24 로 찍힘
        System.out.printf("d=%010.2f\n", d);//반올림 처리되서 5가 되면 1.24 로 찍힘
        System.out.printf("d=%s.\n", url);//반올림 처리되서 5가 되면 1.24 로 찍힘
        System.out.printf("d=[%20s]\n", url);//반올림 처리되서 5가 되면 1.24 로 찍힘
        System.out.printf("d=[%-20s]\n", url);//반올림 처리되서 5가 되면 1.24 로 찍힘
        System.out.printf("d=[%.8s]\n", url);//반올림 처리되서 5가 되면 1.24 로 찍힘
    }
}
