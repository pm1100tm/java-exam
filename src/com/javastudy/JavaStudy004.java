package com.javastudy;

import java.util.ArrayList;

public class JavaStudy004 {
    public static void main(String[] args) {
        /* String 
        * 자바에서 문자열에 해당하는 자료형은 String
        * String a = new String();
        * String b = "asdf";
        * new 키워드는 객체를 만들 때 사용한다.
        * primitive 자료형은 new 라는 키워드를 사용할 수 없다.
        * */
        String a = new String();
        
        /* equal 
        * 두 개의 문자열이 동일한 값을 가지고 있는지 비교하여 boolean 값을 리턴
        * a1, a2 는 값은 같지만 서로 다른 객체이다.
        * == 은 두개의 자료형이 동일한지 판별할 때 사용하기 때문에 false 를 리턴한다.
        * */
        String a1 = "asdf";
        String a2 = "asdf";
        System.out.println(a1.equals(a2)); // true
        
        /* indexOf
        * 문자열에서 특정 문자가 시작되는 인덱스를 리턴한다.
        * Param = str
        * 존재하지 않는다면 -1 리턴
        * */
        String b = "Hello Java";
        System.out.println(b.indexOf("Java")); // 6
        
        /* replace
        * 특정 문자를 바꾸고 싶을 때 사용한다. 모든 문자열에 적용된다.
        * replace(CharSequence oldChar, CharSequence newChar)
        * replace(Char oldChar, Char newChar)
        * */
        String c1 = "Hellooooo Helloo";
        c1 = c1.replace("Hello", "ww");
        System.out.println(c1); // Hellwwwwwwwwww Hellwwww
        
        /* replaceAll
        * 특정 문자를 바꾸고 싶을 대 사용한다. 정규식 사용이 가능하다. 모든 문자열에 적용된다.
        * replace 를 사용한다면 여러번 사용해야 한다.
        * replaceAll(String regex, String replacement)
        * */
        String c2 = "Hello Java Java Javaa";
        c2 = c2.replaceAll("Java", "Hello");
        System.out.println(c2); // "Hello Hello Hello Helloa"
        
        String c3 = "aaaabcaaaabcaaaabc";
        c3 = c3.replaceAll("[abc]", "w");
        System.out.println(c3); // all character w
        
        /* replaceFirst
        * 바꾸고 싶은 문자열이 처음으로 해당할 때만 치환한다.
        * */
        String c4 = new String("asdfasdf");
        c4 = c4.replaceFirst("a", "w");
        System.out.println(c4); // wsdfasdf
        
        /* concat
        * 문자열 합치기. + 연산자와 동작 방식이 다르다.
        * concat 은 합친 문자열을 String 으로 생성해준다.
        * + 연산자는 먼저 StringBuilder 로 변환시킨 후에, append 로 문자열을 더하고 다시 toString 함수로 문자열로 반환한다.
        * */
        String e1 = "aaa";
        String e2 = "bbb";
        e2 = e1.concat(e2);
        System.out.println(e2); // aaabbb
        
        /* StringBuilder
        * + 연산자와 같은 동작.
        * 두개의 문자열을 더할 때는 concat을 사용하는 것이 좋고, 여러 개를 더할 때는 그냥 + 연산자를 사용하는 것이 좋다.
        * */
        StringBuilder sb = new StringBuilder(e2);
        sb.append("ccc");
        sb.append("ddd");
        sb.append("eee");
        System.out.println(sb);
        
        // concat, substring, split, StringBuffer, Casting
        
        /* trim
        * 문자열 공백 제거. 앞 뒤의 공백을 제거한다. 문자열의 중간에 있는 공백은 제거하지 않는다.
        * 중간에 있는 공백까지 제거하려면 replace 혹은 정규식을 써서 제거해야 한다.
        * **/
        String f1 = " exam trim ";
        f1 = f1.trim();
        System.out.println(f1); // "exam trim"
        
        /* Casting
        *  String -> int
        *  String -> Double, Float
        *  String -> Long, Short
        *  int -> String
        *  Double Float -> String
        *  Double Float -> int
        *  int -> Double,Float
        *  **/
        String g1= "10";
        int g1_one = Integer.parseInt(g1); // String -> int
        int g1_two = Integer.valueOf(g1); // String -> int
        System.out.println(g1_one); // 10 int
        System.out.println(g1_two); // 10 int
        
        String s_num = "10";
        double d_num = Double.valueOf(s_num); //String -> Double
        float f_num = Float.valueOf(s_num); //String -> Float
        System.out.println(d_num);
        System.out.println(f_num);

        /* Character
        * char 에 대한 래퍼 클래스(wrapper class)
        * 기본 데이터 타입의 값을 객체 형식으로 표현하기 위해서 사용됨.
        **/
        
        /* contains
        * 대상 문자열에 특정 문자열이 포함되어있는지 판별하는 함수.
        * 대소문자를 구분함.
        * 공백 역시 체크함
        * **/
        String str = "my Java Test";
        ArrayList<Boolean> resultList = new ArrayList<Boolean>();
        boolean resultContains1 = str.contains("java"); // false
        boolean resultContains2 = str.contains("Java"); // true
        boolean resultContains3 = str.contains("m"); // true
        boolean resultContains4 = str.contains("Test"); // true
        resultList.add(resultContains1);
        resultList.add(resultContains2);
        resultList.add(resultContains3);
        resultList.add(resultContains4);
        System.out.println(resultList);
        
        /* contentEqual
        * 문자열 StringBuffer 를 비교하여, 불리언 값을 리턴한다. 
        * **/
        String str1 = "String1";
        String str2 = "String2";
        StringBuffer str3 = new StringBuffer( "String1");
        
        boolean  result = str1.contentEquals( str3 );
        System.out.println(result); // true
        
        result = str2.contentEquals( str3 );
        System.out.println(result); // false

        /* String , StringBuffer, StringBuilder 차이
        * 연산이 많지 않을 때는 어떤 클래스를 사용하더라도 이슈가 발생할 가능성은 거의 없다.
        * 하지만 연산 횟수가 많아지거나 멀티쓰레드, Race condition 등의 상황이 자주 발생한다면
        * 각 클래스의 특징을 이해하고 상황에 맞는 적절한 클래스를 사용해야 한다.
        * String과 StringBuffer/StringBuilder 클래스의 가장 큰 차이점은 String은 불변(immutable)의 속성을 갖는다는 점입니다.
        * 아래의 코드를 보면, 참조변수 exam1 에 world 라는 문자열을 붙이느 연산을 하고 있는데,
        * 이 때 새로운 메모리 영역을 가리키게 변경되고 처음 선언된 hello 값이 할당되어 있던 메모리는 가비지로 남아있다가,
        * GC 에 의해 사라지게 된다. 즉, String 클래스는 불변하기 때문에 문자열을 수정하는 시점에 새로운 String 인스턴스가 생성된 것이다.
        * String 은 불변성을 가지기 때문에 변하지 않는 문자열을 자주 읽어들이는 경우 String 을 사용하면 좋은 성능을 기대할 수 있다. 
        * 하지만 문자열 추가, 수정, 삭제 등의 연산이 빈번하게 발생하는 알고리즘에 String 클래스를 사용하면 heap 메모리에 많은
        * 임시 가비지가 생성되어 힙 메모리 부족으로 어플리케이션 성능에 치명적인 영향을 끼치게 된다.
        * **/
        String exam1 = "hello";
        String strEaxm = exam1 + "world";
        
        /* StringBuilder / StringBuffer
        * 위와 같은 문제를 해결하기 위해서 가변성을 가진 위의 두 클래스를 도입했다.
        * String 과는 반대로 위의 두 클래스는 가변성을 가지기 때문에 append(), delete() 등의 API 를 이용하여
        * 동일 객체 내에서 문자열을 변경하는 것이 가능하다. 따라서 문자열의 추가, 수정, 삭제가 빈번하게 발생하는 경우라면,
        * String 클래스가 아닌 버퍼나 빌더를 사용해야 한다. 즉, 위의 예제에서 새로운 메모리가 생성되지 않고, 기존의 메모리를 사용한다.
        * **/
        
        /* StringBuffer vs StringBuilder
        * 가장 큰 차이점은 동기화의 유무.
        * StringBuffer 는 동기화 키워드를 지원하여 멀티쓰레드에서 안전하다. (thread-safe)
        * String 도 불변성을 가지기 때문에 멀티쓰레드 환경에서 안정성을 가지고 있다.
        * 반대로, StringBuilder 는 동기화를 지원하지 않기 때문에 멀티쓰레드 환경에서 사용하는 것은 적합하지 않아,
        * 동기화를 고려하지 않는 단일 쓰레드에서 StringBuffer 보다 뛰어나다.
        * 
        * 정리
        * String - 문자열 연산이 적고 멀티쓰레드 환경일 경우
        * StringBuffer - 문자열 연산이 많고 멀티쓰레드 환경일 경우
        * StringBuilder - 문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우
        * 일반적인 상황에서 위의 상황을 고려한다면, 성능 최적화를 이룰 수 있다. 일반적인 상황이라면..!
        * **/
    }
}