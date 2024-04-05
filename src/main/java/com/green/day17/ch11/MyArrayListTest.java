package com.green.day17.ch11;


public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(); // 객체화가 되면 0개짜리 배열 에 주솟값을 받앗으면 좋겟다.
        list.showLength();
        list.add(10);
        list.showLength();
        list.add(11);
        list.showLength();
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        // arr 기존 크기보다 1칸 더 큰 새로운 배열을 만들고 그배열의 0번칸에 10을 집어넣는다
        //그 배열 마지막 칸에 넘어온 파라미터 값을 집어넣는다.
        // 새로운 배열의 주솟값을 전역변수 arr 에 대입한다

        int size = list.size(); // list add 갯수대로 짜기
        System.out.println("size :" + size);
        System.out.println(list.get(3)); // 40
        System.out.println(list.get(0)); // 10

        System.out.println(list);//[10,20]

    }
}

class MyArrayList {
    private int[] arr;    //int 배열의 주솟값을 담을수 있는 친구
    // 생성자 리턴타입없고 클래스명이 같아야한다

    public MyArrayList() {
        arr = new int[0];
    }

    public int get(int num) {
        return arr[num];
    }

    public void add(int add) {
        int[] tmp = new int[arr.length + 1];
        tmp[arr.length] = add;
        //tmp[tmp.length-1] = add;
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp;
    }

    void showLength() {
        System.out.println("len" + arr.length);
    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0]));   //StringBuilder 는 반복문에서 자동적으로 더해줌
        for (int i = 1; i < arr.length; i++) {
            sb.append(String.format(", %d", arr[i]));
        }
        sb.append("]");
        return sb.toString();
    }

    int size() {
        return arr.length;
    }


    //    @Override
//    public String toString(){
//        String str = String.format("[%d",arr[0]);
//        for(int i = 1; i < arr.length; i++){
//             str += String.format(", %d",arr[i]);
//        }
//        str += String.format("]");
//        return str;
//    }
}

