package Chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;                    // String : 문자열 변수 / String name="아무개" 처럼 한줄로도 작성 가능
        name = "아무개";                 // 큰 따옴표 써야됨
        int hour = 15;                  // int : 정수형 변수 / ????얘는 왜 소문자로 시작???? 걍 그렇게 정해져 있는 듯
                                                             // 아니었음, 나중에 배울게 있나봄 (클래스, 객체 등등...)

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다");
        System.out.println(name + "님, 배송이 완료되었습니다");

        double score = 90.5;            // double : 실수형 변수
        char grade = 'A';               // char (character) : 한글자 문자 (작은 따옴표 써야됨)
        name = "강백호";                 // 변수 업데이트 가능
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;            // boolean : 불리안 변수
        score = 80;
        System.out.println(score + "점이면 이번 시험에 합격일까요? " + pass);

        double d = 3.14123456789;       // 정밀성 => double > float
        float f = 3.14123456789f;       // float은 실수 뒤에 F,f 적어야함
        System.out.println(d);
        System.out.println(f);

        long i = 1000000000000L;        // long은 정수 뒤에 L,l 적어야함 / int보다 큰 값 가능 (int 범위는 -20억~20억)
        i = 1_000_000_000_000L; //보기편하라고
        System.out.println(i);
    }
}
