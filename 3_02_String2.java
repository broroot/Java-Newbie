package Chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환 : .replacec(원래 문자, 바꿀 문자)
        System.out.println(s.replace(" and",","));

        // 문자열 잘라내기_시작 위치 값에서부터 끝까지 : .substring(시작)
        // 문자열 잘라내기_시작 위치부터 끝 바로 앞까지 : .substring(시작,끝)
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));

        // 앞뒤 공백 제거 : .trim()
        s = "             I love Java.             ";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 합치기 : + / .concat(합칠 문자)
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
