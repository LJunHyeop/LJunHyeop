package com.green.day5.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        //String name = "Java";
        System.out.println(name);
        String str = name + 8.0;
        //String str = "Java" +"8.0"; +와 문자열이 만낫다 (피연산자) 모든것이 문자열로 바뀐다.
        //String str = "Java8.0"; +와 문자열이 만낫다 (피연산자) 모든것이 문자열로 바뀐다.
        System.out.println(str);
        System.out.println(7 + "" + 7);
        System.out.println(7 + 7 + "" + 7); // 147
        //System.out.println(7+7+""+7); // 147
        //System.out.println(14+""+7); // 147
        //System.out.println("14"+7); // 147
        //System.out.println("147"); // 147
        System.out.println(7 + "" + 7 + 7);//777
        //System.out.println("7"+7+7);//777
        System.out.println(7 + "" + (7 + 7));//714
        //System.out.println(7+""+(14));//714
        //System.out.println("7"+14);//714
    }
}
