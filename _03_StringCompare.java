package Chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교 : .equals(비교대상)
        // 대소문자 구분 없이 문자 비교 : .equalsIgnoreCase(비교대상)
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase("java"));

        // 문자열 비교 심화
        // .equals : 둘의 '내용'이 같은지
        // == : 둘이 '참조하는 곳'이 같은지
        s1 = "1234";    // 1234라는 하나의 값을 s1과 s2가 참조 중
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2);      // true

        s1 = new String("1234");    // s1과 s2가 각각의 1234를 참조 중
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2 );     // false
    }
}
