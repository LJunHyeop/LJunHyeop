package com.green.day2;

public class conditionalOperator {
    public static void main(String[] args) {
        // 삼항식,조건식 식 ? ture 일 때 : false 일때 ; 구분은 물음표와 콜론으로 한다.
        String s = "짝";
        s = "홀";
        s = 9 % 2 == 0 ? "짝" : "홀";
        System.out.println();

    }
}
