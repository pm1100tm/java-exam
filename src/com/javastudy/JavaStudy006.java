package com.javastudy;

public class JavaStudy006 {
    public static void main(String[] args) {
        /* Collection - 1 */
        
        /* 컬랙션 프레임웍
        * 여러 객체를 모아 놓은 것을 의미
        * 핵심 인터페이스
        * List, Set, Map
        * 
        * List - ArrayList, LinkedList, Stack, Vector
        * 순서가 있는 데이터의 집합, 데이터의 중복을 허용
        * 
        * Set - HashSet, TreeSet
        * 순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다.
        * 
        * Map - HashMap, TreeMap, HashTable, Properties
        * 키, 값 쌍으로 이루어진 데이터의 집합
        * 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.
        * 
        * List 인터페이스의 메서드
        * void add(int index, Object element)
        * boolean addAll(int index, Collection c)
        * Object get(int index)
        * int indexOf(Object o)
        * int lastIndexOf(Object o)
        * ListIterator listIterator()
        * ListIterator listIterator(int index)
        * Object remove(int index, Object element)
        * Object set(int index, Object element)
        * void sort(Comparator c)
        * List subList(int fromIndex, int toIndex)
        * 
        * Set 인터페이스
        * boolean add(Object o)
        * void clear()
        * boolean contains(Object o)
        * boolean equals(Object o)
        * int hashCode()
        * boolean isEmpty()
        * iterator iterator()
        * boolean remove(Object o)
        * int size()
        * Object[] toArray()
        * Object[] toArray(Object[] a)
        * 
        * boolean addAll(Collection c) 합집합
        * boolean containsAll(Collection c) 부분집한
        * boolean removeAll(Collection c) 차집합
        * boolean retainAll(Collection c) 교집합
        * 
        * Map 인터페이스의 메서드
        * void clear()
        * boolean containsKey(Object key)
        * boolean containsValue(Object value)
        * Set entrySet()
        * boolean equals(Object o)
        * Object get(Object key)
        * int hashCode()
        * boolean isEmpty()
        * Set keySet()
        * Object put(Object key, Object value)
        * void putAll(Map t)
        * Object remove(Object key)
        * int size()
        * Collection values()
        * 
        * Vector 와 ArrayList
        * ArrayList는 기존의 Vector 를 개선한 것으로 구현원리와 기능적으로 동일
        * Vector 는 자체적으로 동기화 처리가 되어있으나 ArrayList 는 그렇지 않다.
        * 
        * List 인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용한다.
        * 데이터의 저장공간으로 배열을 사용한다. (배열 기반)
        * **/
        
        /* HashSet, TreeSet : 순서, 중복 X
        * HashSet
        *   Set 인터페이스를 구현한 대표적인 클래스
        *   순서를 유지하려면, LinkedHashSet 클래스를 사용하면 된다.
        *   HashSet 은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인한다.
        *   같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
        * 
        * TreeSet
        *   범위 검색과 정렬에 유리한 컬렉션 클래스
        *   HashSet 보다 데이터 추가, 삭제에 시간이 더 걸림
        *   범위 검색과 정렬에 유리한 이진 검색 트리(binary search tree) 로 구현
        *   링크드 리스트처럼 각 요소(node)가 나무(tree) 형태로 연결된 구조
        *   이진 트리는 모든 노드가 최대 두 개의 하위 노드를 갖음 (부모 - 자식 관계)
        *   이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값은 오른쪽에 저장
        *   HashSet 보다 데이터 추가, 삭제에 시간이 더 걸린다 (반복적인 비교 후 저장)
        * */
        
        /* HashMap
        * 해싱(hashing) 기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
        * Map 인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장한다.
        * HashMap map = new HashMap();
        * map.put("key", "value");
        * 해시 함수로 해시테이블에 데이터를 저장, 검색
        * 해시 테이블은 배열과 링크드 리스트가 조합된 형태이다.
        * */
        
        /* TreeMap
        * 
        * */
    }
}