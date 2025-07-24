package Chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건 else if (여러번 사용 가능)
        // 마지막 else는 없어도 됨

        // 한라봉 에이드 있으면 +1
        // 없으면, 망고 주스 있으면 +1
        // 없으면, 아이스 아메리카노 +1

        boolean ade = false;
        boolean juice = false;
        boolean orange = false;

        if (ade) {
            System.out.println("한라봉 에이드 +1");
        } else if (juice) {
            System.out.println("망고 주스 +1");
        } else if (orange) {
            System.out.println("오렌지 주스 +1");
        } System.out.println("아이스 아메리카노 +1");
        
        System.out.println("커피 주문 완료 #1");
    }
}
