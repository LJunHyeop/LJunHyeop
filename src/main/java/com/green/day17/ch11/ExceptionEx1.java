package com.green.day17.ch11;

//예외
public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            System.out.println("===시작===");
            int a = 10;
            int b = 20;
            // int c = 10/0; // 예외가 발생되면시스템이 뻗고 예외가 발생되면 catch 가 그걸 잡고 예외발생이 출력되고 난후 종료가 출력 시스템은 안멈춤
            throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println("수학적 예외 발생 !!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("----예외발생-----");   // 예외발생은 안뜸

        } finally {
            System.out.println("finally 반드시 실행한다. "); // 옵션 예외가 발생이 되든 안되는 무조건 실행이됨
        }
        System.out.println("---종료---");

    }
}
