package Chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 (Type Casting)
        // 정수형 <-> 실수형 사이의 변환

        // int -> float / double
        int score = 93;
        System.out.println(score);           //93
        System.out.println((float)score);    //93.0
        System.out.println((double)score);   //93.0

        // float / double -> int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f);   //93
        System.out.println((int)score_d);   //98

        // 정수 + 실수 연산
        score = 93 + (int)98.8;         //93+98
        System.out.println(score);      //191

        score_d = (double)93+98.8;      //93.0+98.8
        System.out.println(score_d);    //191.8

        // 변수 자체에 형변환된 데이터 넣기
        // int -> long -> float -> double : 큰 범위로 갈 때는 자동 형변환
        float score_QQ = score;

        // double -> float -> long -> int : 작은 범위로 갈 때는 수동 형변환
        int score_GA = (int) score_f;

        // 숫자 -> 문자열
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열 -> 숫자
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바");
    }
}
