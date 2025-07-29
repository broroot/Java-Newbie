package Chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number) {  // 여기서 number는 Parameter, 매개변수(전달값)
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    // number를 exponent만큼 제곱
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);

    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // 여기서 2와 3은 Argument, 인수
        power(2);
        power(3);

        powerByExp(2,3);
        powerByExp(3,3);
    }
}
