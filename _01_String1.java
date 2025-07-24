package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 : .length()
        System.out.println(s.length());

        // 대소문자 변환
        // 대문자로 변환 : .toUpperCase()
        // 소문자로 변환 : .toLowerCase()
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계 : .contains(텍스트)
        // (처음) 위치 찾기 : .indexOf(텍스트) (처음이 0부터 시작)
        // 마지막 위치 찾기 : .lastIndexOf(텍스트)
        // * 포함하지 않으면 -1
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#"));             // 포함되지 않을 시 -1
        System.out.println(s.indexOf("and"));            // 처음 일치하는 위치
        System.out.println(s.lastIndexOf("and"));    // 마지막에 일치하는 위치

        // 특정 문자로 시작하는지 확인 : .startsWith
        // 특정 문자로 끝나는지 확인 : .endsWith
        // * 대소문자 구분함
        System.out.println(s.startsWith("I Like"));
        System.out.println(s.endsWith("."));

    }
}
