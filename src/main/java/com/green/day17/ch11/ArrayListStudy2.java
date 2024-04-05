package com.green.day17.ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int n1 = 10;
        Integer n2 = 10;
        System.out.println(n1 == n2);
        double d1 = 10.1;
        Double d2 = 10.1;
        List<Integer> list = new ArrayList(); // 뒤에를 딴거로 바꾸고싶을때 부모인 list가 더 유연하기 때문에 list 쓰는게 나음
        List<Integer> list2 = new LinkedList();// < > 적는거랑 안적는거 똑같음
        // <> 안에 primitive 타입은 안됨
        list.add(10); // 이제 정수밖에 안들어감 (제네릭 Generic)
        list.add(20);
        list.add(30);
        //list.add("우와우");
        list.remove(0); // 0번방을 삭제하겠다
        int r1 = list.get(0);//// 형변환 안해도 됨
        int r2 = list.get(1);// 배열과는 다르게 크기를 늘리고 줄이고 할 수 있음.

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(" list.ger(%d) >> %d \n", i, list.get(i));
        }
    }
}
