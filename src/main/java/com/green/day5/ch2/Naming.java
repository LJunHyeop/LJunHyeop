package com.green.day5.ch2;

public class Naming {

    public static void main(String[] args) {
        /*네이밍 규칙
        1.변수 명명규칙
        - 대소문자 가 구분 , 길이제한 x
        2.예약어 사용 금지  int public ;   int void
        3. 숫자로 시작 하면 되지않는다 . int 1abc; int 1 sadnfsadnf ;등
        4. 숫자가 시작만 아니면 어느위치든 사용가능 int a123 가능
        5. 특수기호는 _ $ 만 허용가능 언더바,달러 int_123, $123; 가능
        6. 여러 단어로 구성된 이름은 카멜 케이스 기법을 사용한다 .
        6-1 EX last index,of >> lastIndexOf happy,sunday,morning >happySundayMorning
         */
        /*
        케밥 케이스 기법 happy-sunday-morning
         */
        /*클래스 명명규칙
        1. 클래스의 이름의 첫 글자는 무조건 대문자로 시작!
        2.여러 단어로 구성된 이름은 첫글자를 모두 대문자로 한다. >파스칼 케이스 기법
        3.ex) last index,of >> LastIndexOf  string,buffer >>> StringBuffer
         */
        /*상수 명명 규칙
        데이터 타입 앞에 final 키워드가 들어간다.
        1. 상수이름은 모두 대문자로한다. 단어 구분은 _(언더바)로 한다.
        EX last, index, of >>> LAST_INDEX_OF | string, buffer >>>STRING_BUFFER
        2. 1번방식으로 이름을 작성 하는 건 primitive type , String 일 때 하는편이다.
         */
        final int LAST_INDEX_OF = 10;
        final String NAME = "홍길동";
        int abc, Abc, aBc, abC;
        int aaaaaaaaaaaaaaaaaaaaaaaaaaaa;
        int String; //사용은 가능하나 클래스명 이기때문에 가급적 사용 하지않는걸 추천

    }
}
