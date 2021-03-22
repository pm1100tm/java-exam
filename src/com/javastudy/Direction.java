package com.javastudy;

enum Direction {
    /* Enum 클래스에 정의된 ordinal 은 열거형 상수가 정의된 순서를 반환하지만,
    * 이 값을 열거형 상수의 값으로 사용하지 않는 것이 좋다.
    * 이 값은 내부적인 용도로만 사용되기 위한 것이디 때문이다.
    * 열거형 상수의 값이 불규칙적인 경우에는 이 때는 다음과 같이 열거형 상수의 이름 옆에 원하는 값을 괄호() 와 함께 적어주면 좋다.
    * 
    * 열거형의 인스턴스 변수는 반드시 final 이어야 한다는 제약은 없지만, value 는 열거형 상수의 값을 저장하기 위한 것이므로,
    * final 을 붙인다. 그리고 외부에서 이 값을 얻을 수 있도록 get 메서드를 추가해준다.
    * 
    * 열거형의 생성자는 제어자가 묵시적으로 private 이다.
    * 따라서 열거형의 객체를 외부에서 생성할 수 없다.
    * */
    
    EAST  (1, ">"),
    SOUTH (2, "V"),
    WEST  (3, "<"),
    NORTH (4, "^"),
    ;
    
    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;
    
    Direction(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }
    
    public int getValue(){
        return value;
    }
    
    public String getSymbol(){
        return symbol;
    }
    
    public static Direction of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir - 1];
    }
    
    public Direction rotate(int num) {
        num = num % 4;
        if (num < 0) num += 4;
        return DIR_ARR[(value-1 + num) % 4];
    }
    
    public String toString(){
        return name() + getSymbol();
    }
}

class EnumEx {
    public static void main(String[] args) {
        for (Direction d : Direction.values()){
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        }
        
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(1);
        
        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        System.out.println(Direction.EAST.rotate(1));
        System.out.println(Direction.EAST.rotate(2));
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));
    }
}