package com.javastudy;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaStudy003 {
    // chapter 5 - 배열 (array)
    // 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
    // 배열의 각 요소는 서로 연속적이다.

    public static void main(String[] args) {
        /* 배열의 선언과 생성.
         *  타입 또는 변수명 뒤에 대괄호를 붙여서 선언, 변수명을 앞에 둬도 무방.
         *  선언한 배열을 콘솔에 찍으려 하였을 때, 컴파일 되지 않는 이유 - 배열을 선언하였을 뿐 초기화 시키지 않았기 때문.
         *  배열을 선언한다고 해서 값을 저장할 공간이 생성되는 것이 아니다. 다만, 변수가 선언된다.
         * */
        int[] array;
        int array2 [];

        /* 배열의 초기화 - 생성된 배열에 처음으로 값을 저장하는 것
         * */
        // 길이를 지정하여 초기화
        int[] array3 = new int[5];
        System.out.println(array3);

        // 값을 지정하여 초기화
        int[] array4 = {1, 2, 3, 4, 5};
        System.out.println(array4);

        // 값을 지정하여 초기화
        int[] array5 = new int[] {1, 2, 3, 4, 5};
        System.out.println(array5);

        // 컴파일 에러
        int[] array6;
        // array6 = [1, 2, 3, 4, 5]

        // 선 선언, 후 초기화
        int[] array7;
        array7 = new int[]{1, 2, 3, 4, 5};
        
        // 연습 코드
        // 45개의 정수 값을 저장하기 위한 배열 생성
        int[] balls = new int[45];
        
        // 배열의 0~44 에 1~45 까지의 값을 부여
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }
        System.out.println(Arrays.toString(balls));
        
        // 변수 temp, j 생성
        int temp = 0;
        int j = 0;
        
        // 45번 반복, 난수 0~44 를 생성
        // 배열의 0번째 값을 지역변수 temp 에 대입
        // 발생한 난수 번째의 값을 배열의 0 번째에 대입
        // 0번째 값을 저장한 지역변수 temp 를 난수번째의 배열에 대입
        for (int i = 0; i < balls.length; i++){
            j = (int) (Math.random() * 45);
            temp = balls[0];
            balls[0] = balls[j];
            balls[j] = temp;
        }
        
        // 0~5 까지 6개의 배열의 값을 출력
        for (int i = 0; i < 6; i++){
            System.out.println(balls[i] + " ");
        }
        
        char[] hex = {'C', 'A', 'F', 'E'};
        String[] binary = {
                "0000",
                "0001",
                "0010",
                "0011",
                "0100",
                "0101",
                "0110",
                "0111",
                "1000",
                "1001",
                "1010",
                "1011",
                "1100",
                "1101",
                "1110",
                "1111"
        };
        
        String result = "";
        for (int i = 0; i < hex.length; i++){
            if (hex[i] >= '0' && hex[i] <= '9'){
                result += binary[hex[i] - '0'];
            } else {
                // A~F 일 경우
                result += binary[hex[i] - 'A' + 10];
            }
        }
        
        System.out.println("hex: " + new String(hex));
        System.out.println("binary: " + result);
        
        /* 다차원 배열의 선언과 생성
        *  [] 의 개수가 차원의 수를 의미한다.
        * **/
        int[][] array8;
        int array9 [][];
        int[] array10[];
        int[][] array11 = new int[5][3];
        
        for (int i = 0; i < array11.length; i++){
            for (int k = 0; k < array11[i].length; k++){
                array11[i][k] = 10;
            }
        }
        
        // 2차원 배열 for문 하나로 출력
        //https://coozplz.me/2011/11/09/2%EC%B0%A8%EC%9B%90-%EB%B0%B0%EC%97%B4for%EB%AC%B8-%ED%95%98%EB%82%98%EB%A1%9C-%EC%B6%9C%EB%A0%A5/
        
        /* 배열의 복사
        *  for 문을 이용한 배열의 복사 밑 메서드 활용
        * **/
        int[] array12 = new int[10];
        for (int i = 0; i < 10; i++){
            array12[i] = i;
        }
        
        // Object.clone() 깊은 복사
        int[] copyArray1 = array12.clone();

        // Arrays.copyOf() - 첫번째 부터 지정한 길이 까지 깊은 복사 
        int[] copyArray2 = Arrays.copyOf(array12, array12.length);

        // Arrays.copyOfRange() - 지정한 배열부터 지정한 배열까지 깊은 복사
        int[] copyArray3 = Arrays.copyOfRange(array12, 0, 3);
        
        // System.arraycopy(기존 배열, 시작 지점, 복사할 배열, 복사할 배열의 시작점, 복사할 길이)
        int[] copyArray4 = new int[array12.length];
        System.arraycopy(array12, 0, copyArray4, 0, array12.length);
        
        array12[0] = 100;
        System.out.println(copyArray1[0]);
        System.out.println(copyArray2[0]);
        System.out.println(copyArray3[0]);
        System.out.println(Arrays.toString(copyArray4));
    }
}




