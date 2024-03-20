package com.green.day5;

//90점이상 A학점 80점 이상 B 70점이상 C 나머지 F
public class MissionGradeV2 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 131) - 10;
        System.out.println(score);
        int mon = score / 10;
        int mon2 = score % 10;
        //if 문으로 잡고 else if 로 빼야된다.

        // -10 ~ 120 사이의 정수
        // 10의자리 숫자가 10>9 = A 8> B 7> C 6> f
        // 1의자리숫자가 0~2 - 3~6 0 7~9 +
        // score 값이 0~100사이의 값이 아니면 점수가 잘못되엇습니다 출력 > 끝 !
        //단 100점은 A+ F는 +-0가 없음 무조건 F
        switch (mon) {
            case 10: {
                switch (mon2) {
                    case 0:
                        System.out.println("당신은 A+입니다.");
                    {
                        break;
                    }
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                        System.out.println("점수가 잘못되었습니다.");
                }
                {
                    break;
                }

            }
            case 9: {
                switch (mon2) {
                    case 0, 1, 2:
                        System.out.println("당신은 A-입니다.");
                    {
                        break;
                    }
                    case 3, 4, 5, 6:
                        System.out.println("당신은 A0입니다.");
                    {
                        break;
                    }
                    case 7, 8, 9:
                        System.out.println("당신은 A+입니다 ");
                    {
                        break;
                    }
                }
                {
                    break;
                }
            }
            case 8: {
                switch (mon2) {
                    case 0, 1, 2:
                        System.out.println("당신은 B-입니다");
                    {
                        break;
                    }
                    case 3, 4, 5, 6:
                        System.out.println("당신은 B0 입니다");
                    {
                        break;
                    }
                    case 7, 8, 9:
                        System.out.println("당신은 B+입니다");
                    {
                        break;
                    }
                }
                {
                    break;
                }
            }
            case 7: {
                switch (mon2) {
                    case 0, 1, 2:
                        System.out.println("당신은 C-입니다");
                    {
                        break;
                    }
                    case 3, 4, 5, 6:
                        System.out.println("당신은 C0 입니다");
                    {
                        break;
                    }
                    case 7, 8, 9:
                        System.out.println("당신은 C+입니다");
                    {
                        break;
                    }
                }
            }
            {
                break;
            }
            case 0, 1, 2, 3, 4, 5, 6:
                System.out.println("당신은 F입니다");
            {
                break;
            }
            default: {
                break;
            }
        }
    }
}