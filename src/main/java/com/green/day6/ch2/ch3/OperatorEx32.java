package com.green.day6.ch2.ch3;

// 절댓값 치환
public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;
        x = 10;
        y = -5;
        z = 0;
// absX값이 -10 이든 10 이든 10이나오게 하기
        absX = x;
        absY = y;
        absZ = z;
        if (x < 0) {
            System.out.println(-absX);
        } else {
            System.out.println(absX);
        }
        absX = x < 0 ? -x : x;
        System.out.println(absX);

        signX = (x == 0) ? ' '
                : x < 0 ? '-' : '+';
        signY = (y == 0) ? ' '
                : y < 0 ? '-' : '+';
        signZ = (z == 0) ? ' '
                : z < 0 ? '-' : '+';
        System.out.printf("x=%c%d\n", signX, absX);
        System.out.printf("x=%c%d\n", signY, absY);
        System.out.printf("x=%c%d\n", signZ, absZ);

        // 복합 대입 연산자 (compound Assignment Operators)
        int n = 1;
        n = n + 1; // n=2
        n = n + 2; // n=4
        n = n + 3; // n=7
        System.out.println(" 1-n : " + n);

        int m = 1;
        m += 1;
        m += 2;
        m += 3;
        System.out.println(" 2- m: " + m);

        int k1 = 10, k2 = 3;
        k1 %= k2;
        System.out.println("3 - k1 :" + k1);

    }
}
