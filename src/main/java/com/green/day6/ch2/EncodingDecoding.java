package com.green.day6.ch2;

public class EncodingDecoding {
    public static void main(String[] args) {
        char c = 'B';
        //int i = int(c);
        int i = c; //자동형변환 , 인코딩

        char c2 = (char) i; //디코딩
        System.out.printf("c : %c, i : %d, c2 : %c\n", c, i, c2);

    }
}
