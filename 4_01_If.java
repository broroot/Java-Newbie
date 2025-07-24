package Chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        // 2개 이상의 문장 수행시 {  } 사용
        int hour=15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        System.out.println("---------");

        hour = 10;
        boolean morningCoffee = false;
        // if (hour < 14 && morningCoffee == false) {
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        System.out.println("---------");

        hour = 15;
        morningCoffee = false;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료");
    }
}
