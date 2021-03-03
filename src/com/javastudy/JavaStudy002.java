package com.javastudy;

public class JavaStudy002 {
    // chapter 4 - 조건문 반복문
    //==================================================================================================
    public static void main(String[] args) {
        System.out.println("day02 - 2021-03-03");

        /* IF  조건문 */
        int num = 1;
        if (num == 1) {
            System.out.println("1");
        } else if (num == 2){
            System.out.println("2");
        } else {
            System.out.println("else");
        }

        /* switch
        * 조건식의 계산 결과와 일치하는 case 로 이동하여 실행.
        * break 문을 만날 때 까지 문장을 수행하고, break 가 없다면 switch 문의 끝까지 이동한다.
        * 조건에 맞지 않으면 default 로 이동한다.
        * case 문의 값으로 변수를 사용할 수 없다. 리터럴, 상수만 사용 가능하다.
        * 중첩 switch 문도 가능하다.
        * 주로 if 를 사용하되, 경우의 수가 많은 경우 switch 문을 사용한다.
        * if 보다 switch 문이 더 간결하고 효율적이다.
        * */
        String flag = "case_001";
        switch (flag) {
            case "case_001":
                System.out.println("case_001");
                break;

            case "case_002":
                System.out.println("case_002");
                break;

            case "case_003":
                System.out.println("case_003");
                break;

            case "case_004":
                System.out.println("case_004");
                break;

            default:
                System.out.println("case_default");
                break;
        }

        String str = "";
        char ch = '\u0000';

        /* Math.random()
        * 0.0 과 0.1 사이의 double 값을 반환한다. (0.0 <= Math.random() <= 0.1)
        * */
        int score = (int)(Math.random() * 10) + 1;

        /* 반복문 (for, while, do-while)
        * break
        *  - 자신이 포함된 하나의 반복문 또는 switch 문을 빠져 나온다.
        *  - 주로 if 문과 함께 사용해서 특정 조건을 만족하면 반복문을 벗어나게 한다.
        * continue
        *  - continue 문 이후의 문장들은 수행되지 않는다.
        * */
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        int k = 1;
        while(k <= 5){
            System.out.println(k);
            k++;
        }

        int j = 0;
        do {
            j++;
            System.out.println(j);
        } while (j <= 5);
    }
}
