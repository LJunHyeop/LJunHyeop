package com.green.day12;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10); // (콘솔출력) 짝수입니다.
        mm.checkOddEven(11); // (콘솔출력) 홀수입니다.
        mm.checkOddEven(100); // (콘솔출력) 짝수입니다.
        mm.checkOddEven(13); // (콘솔출력) 홀수입니다.

        int r = mm.abs(10);
        System.out.println(r); // 10
        r = mm.abs(-8);
        System.out.println(r);

        int randomValue = mm.getRandomValue(10); // 0~9 랜덤값 리턴
        System.out.println(randomValue);
        randomValue = mm.getRandomValue(100); // 0~9 랜덤값 리턴
        System.out.println(randomValue);

        mm.printGugudan(3);

        mm.printGugudan(5);

        int randomValue2 = mm.getRandomValue(10, 20); // 10~ 19 랜덤한 숫자 나올수있도록
        System.out.println(randomValue2);
        randomValue2 = mm.getRandomValue(5, 30); // 5~ 29 랜덤한 숫자 나올수있도록
        System.out.println(randomValue2);


//       Scanner scan = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요: >> ");
//       int i = scan.nextInt();
////       System.out.printf("%d\n ",mm.checkOddEven(i));
//        mm.checkOddEven(i);
    }
}

class MyMethod {
    void checkOddEven(int n1) {
        System.out.println(n1 % 2 == 0 ? "짝수입니다." : "홀수입니다.");
    }

    int abs(int num) {
        return num < 0 ? -num : num;
    }

    int getRandomValue(int num) {
        return (int) (Math.random() * num);
    }

    void printGugudan(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d \n", dan, i, dan * i);
        }
    }

    int getRandomValue(int n1, int n2) {
        return (int) (Math.random() * (n2 - n1)) + n1;
    }
}
//    int abs (int n1){
//       if(n1 < 0 ) {
//           return  -n1;
//       } else {
//           return n1;
//       }
//    }
//    String checkOddEven (int n1){
//    return System.out.println(n1 % 2 == 0 ? "짝수입니다." : "홀수입니다.")
//    }
