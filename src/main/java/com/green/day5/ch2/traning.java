package com.green.day5.ch2;

import java.util.Scanner;

public class traning {
    public static void main(String[] args) {
        int age = 22;
        double height = 178.2;
        char bloodType = 'A';
        String name = "홍길동";
        String b = "나는 싱글입니다";
        String c = " 저는 싱글이 아닙니다.";
        Scanner scan = new Scanner(System.in);
        System.out.print("당신은 싱글인가요?");
        String a = scan.next();
        if (a.equals("예") || a.equals("맞아요") || a.equals("네")) {
            System.out.printf("저의 이름은 %s 입니다. 나이는 %s 살 키는 %scm, 혈액형은 %s형 이고 %s.\n",
                    name, age, height, bloodType, b);
        } else if (a.equals("아니요") || a.equals("아닙니다")) {
            System.out.printf("저의 이름은 %s 입니다. 나이는 %s 살 키는 %scm, 혈액형은 %s형 이고 %s.\n",
                    name, age, height, bloodType, c);
        } else {
            System.out.println("성별을 다시 입력해 주세요");
        }
        //String anwser = new Scanner(System.in);
        //if(anwser == "예" )
        //}
        // true >> 싱글입니다. false > 싱글이 아닙니다.
        //저의 이름은 홍길동입니다. 나이는 22살 키는 178.2cm 혈액형응 a형 싱글입니다.
        //System.out.printf("저의 이름은 %s 입니다. 나이는 %s 살 키는 %scm, 혈액형은 %s형입니다.\n",
        //name,age,height, bloodType);
    }
}
