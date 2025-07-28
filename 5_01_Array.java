package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값을 여러개 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        // 배열 선언 첫번째 방법
        // String[] coffees = new String[4];

        // 배열 선언 두번째 방법
        // String coffees[] = new String[4];

//        coffees[0] = "아메리카노"; // index는 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 세번째 방법
        // String [] coffees = new String[] {"아메리카노","카페모카","라떼","카푸치노"};

        // 배열 선언 네번째 방법
        String [] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        System.out.println("-------------------------------");
        // 커피 주문
        System.out.println(coffees[0]);
        System.out.println(coffees[1]);
        coffees[2] = "에스프레소";
        System.out.println(coffees[2]);
        System.out.println(coffees[3]);

        int j;
        for (j=0 ; j<4 ; j++) {
            System.out.println(coffees[j]);
        }

        // 다른 자료형
        int [] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double [] d = new double [] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};
    }
}
