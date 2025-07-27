package Chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님
        System.out.println("어서오세요. 나코입니다.");

        System.out.println("---------");

        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println("어서오세요. 나코입니다" + i);
        }

        System.out.println("-------------");

        // 짝수만 출력 (fori 자동완성됨)
        // System.out.println 에서 ln이 줄바꿈 역할 => ln 빼면 한줄로 출력
        for (int i = 0; i < 10 ; i+= 2) {
            System.out.print(i);
        }
        System.out.println();
        // 홀수만 출력
        for (int i = 1; i < 10 ; i+= 2) {
            System.out.print(i);
        }
        System.out.println();
        // 거꾸로 출력
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }
        System.out.println();
        // 1부터 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
