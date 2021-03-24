package com.javastudy;

public class JavaStudy010 {
    /* Enum */
    /* 출처: https://woowabros.github.io/tools/2017/07/10/java-enum-uses.html
    * Enum 을 통해 얻는 장점
    * - 문자열과 비교해 IDE 의 적극적인 지원
    *   자동완성, 오타검증, 텍스트 리펙토링
    * - 허용 가능한 값들을 제한할 수 있음.
    * - 리펙토링시 변경 범위 최소화
    *   내용의 추가가 필요하더라도, Enum 코드 외에 수정할 필요가 없음
    * 
    * Java 의 경우 Enum 은 완전한 기능을 갖춘 클래스
    * 
    * 1. 데이터들 간의 연관관계 표현 - 아래의 메서드 참조
    * 기능에 문제는 없지만
    *   불필요한 코드량이 많음.
    *   Y, N 외에 R, S 등의 추가 값이 필요한 경우 if 문을 포함한 메서드 단위로 코드가 증가하게 된다.
    *   동일한 타입의 값이 추가되는 것에 비해 너무 많은 반복성 코드가 발생하게 된다.
    * */
    
    /** 1. 데이터들 간의 연관관계 표현 */
    public String toTableValue(String originValue) {
        if("Y".equals(originValue)) {
            return "1";
        } else {
            return "0";
        }
    }
    
    public boolean toTable2Value(String originValue) {
        if("Y".equals(originValue)) {
            return true;
        } else {
            return false;
        }
    }
    
    /* 값 + 타입 관리
    * C 언어 에서는 타입이 달라도 값이 같으면 조건식 결과가 참이지만, 자바의
    * 타입에 안전한 열거형 (typesafe enum) 에서는 실제 값이 같아도 타입이 다르면 조건식의 결과가 false 가 된다.
    * 이처럼 값뿐만 아니라 타입까지 체크하기 때문에 타입에 안전하다고 하는 것.
    * 
    * 열거형 상수간의 비교에는 == 을 사용할 수 있다. equal() 이 아닌 == 로 비교하여 그만큼 빠른 성능을 제공한다.
    * > < 와 같은 비교 연산자는 사용할 수 없고, compareTo 는 사용 가능.
    * compareTo - 비교 대상이 같으면 0, 왼쪽이 크면 양수, 오른쪽이 크면 음수 반환
    * switch 문의 조건식에도 열거형을 사용할 수 있는데, 열거형의 이름을 적지 않고 상수의 이름만 적어야 한다.
    * 
    * ENUM_NAME.values() - 모든 상수를 배열에 담아 반환한다.
    * 이 메서드는 모든 열거형이 가지고 있는 것으로 컴파일러가 자동으로 추가해준다.
    * ordinal() - 정의된 순서를 (0부터) 정수로 반환한다.
    * 
    * Class<E> getDeclaringClass() - 열거형의 Class 객체를 반환한다.
    * String name() - 열거형 상수의 이름을 문자열로 반환한다.
    * int ordinal() - 열거형 상수가 정의된 순서를 반환한다.
    * T valueOf(Class<T> enumType, String name) - 지정된 열거형에서 name 과 일치하는 열거형 상수를 반환한다.
    * 
    * 
    * 
    * */
    
    public static void main(String[] args) {
        
    }
}
