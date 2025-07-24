package Chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자 , 이스케이프 문자 (Escape Sequence, Escape Character, Special Chracter)

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : tab
        // 파전 9000원
        // 김치전 5000원
        // 부추전 7000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t5000원");
        System.out.println("부추전\t7000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰 따옴표
        // \' : 작은 따옴표
    }
}
