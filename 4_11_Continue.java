package Chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중에 노쇼
        // For
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 넘어갑니다.");
                continue;       // 이하 코드를 생략 후 바로 다음 동작으로
            }


            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("------------------");

        // While 문
        sold = 0;
        int index = 0;
        while (index < 50) {
            index++;
            System.out.println(index + "번 손님, 치킨 나왔습니다.");

            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 넘어갑니다");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("영업종료");
    }
}
