package com.green.day18;

public class ExamTest {
    public static void main(String[] args) {
        //5 ~20 사이의 랜덤값리턴
        int rVal = Exam.getRandomValue(1, 11);
        int rVAl2 = Exam.getRandomValue(1, 101);
        Exam.printOddEven(rVAl2); // ?은 짝수입니다. //?은 홀수입니다.

//        for(int i = 0; i < 500; i++){
//            ; // 1~10사이의 랜덤값 리턴
//            rVal = Exam.getRandomValue(1,11);
//            if(rVal<1 || rVal>5){
//                System.out.println(" 1~5 사이가 아님 ");
//                {break;}
//            }
//        }
        //val1 이 짝수고 val2도 짝수면 val2 - val1 값을 출력 홀수면 val1 값만 출력
        //val1 이 홀수고 val2가 짝수면 val2-5 값을 출력 홀수면 val2값만 출력
        System.out.println("---종료---");
        Exam.test(rVal, rVAl2);

        System.out.println("---종료---");

        Exam.printNumTonum(4, 22); // 2~20 숫자로 세로로 출력
        System.out.println("------------");

        int score = Exam.getRandomValue(-100, 100);
        System.out.println("Score : " + score);

        String grade = Exam.getGrade(score);
        System.out.println("점수는 : " + grade);
        // Score 값이 0~100 사이가 아니라면 점수가 잘못되었습니다. 리턴
        //10의자리 숫자가 10,9 A :  8 B : 7 C : 6부터 F
        //1의자리숫자가 0~2 - 3~6 0 7~9 +
        System.out.println("------------");
        int sum = Exam.getSumFromTo(8, 20);
        System.out.println("Sum : " + sum);

    }
}

class Exam {
    public static int getSumFromTo(int i, int k) {
        int sum = 0;
        int j = i;
        for (i = j; i <= k; i++) {
            sum += i;
        }
        return sum;
    }

    public static String getGrade(int score) {
        if (score < 0 || score > 100) {
            return "점수가 잘못되었습니다";

        }
        int tenNum = score / 10;
        int Num = score % 10;
        if (score / 10 == 10) {
            return "A+";
        }
        String result = switch (tenNum) {
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "F";
        };
        if (result.equals("F")) {
            return result;
        }
        String result2 = switch (Num) {
            case 0, 1, 2 -> "-";
            case 3, 4, 5, 6 -> "0";
            default -> "+";
        };
        return result + result2;
    }

    static void test(int rVal, int rVal2) {
        if (rVal % 2 == 0) {
            System.out.println(rVal2 % 2 == 0 ? rVal2 - rVal : rVal);
            return;
        }
        System.out.println(rVal2 % 2 == 0 ? rVal2 - 5 : rVal2);
    }

    static void printNumTonum(int k, int j) {
        int z = k;
        for (k = z; k <= j; k++) {
            System.out.println("숫자," + k);
        }
    }

    public static int getRandomValue(int i, int z) {
        final int rVal = (int) (Math.random() * (z - i)) + i;
        return rVal;
    }

    public static void printOddEven(int rVal) {
        System.out.printf(" %d 는 %c수 입니다\n", rVal, rVal % 2 == 0 ? '짝' : '홀');
//        if(rVal %2 == 0  ){
//            System.out.printf("%d 는 짝수입니다.",rVal);
//        }else {
//            System.out.printf("%d 는 홀수입니다.",rVal);
//        }

    }
}
