package com.javastudy;

import java.util.Arrays;
import java.util.Comparator;


public class JavaStudy007 {
    
    public static void examComparator() {
        Integer[] arr = {30, 50, 10, 20, 40};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        String[] arr2 = {"asdf", "Biejf", "oinelrkj", "Kbvlna", "Dieoij"};
        Arrays.sort(arr2, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
        System.out.println(Arrays.toString(arr2));

        Integer[] arr3 = {30, 50, 10, 20, 40};
        Arrays.sort(arr3, new Descending()); // 역순 정렬
        System.out.println(Arrays.toString(arr3));
    }
    
    public static void main(String[] args) {
        /* Collection - 2 */
        JavaStudy007.examComparator();
        
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
            // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
        }
        return -1;
    }
}