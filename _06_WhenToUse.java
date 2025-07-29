package Chap_06;

public class _06_WhenToUse {
    // 메소드가 필요한 이유
    // 같은 계산을 반복적으로 할 때

    // 메소드 내에서도 다른 메소드 이용 가능
    public static int getPower(int number) {
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {



    }
}
