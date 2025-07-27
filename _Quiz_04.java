package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;
        int price = 4000 * hour;
        boolean smallCar = true;
        boolean disablePeople = true;

        if (price > 30000) {
            price = 30000;
        }

        if (smallCar || disablePeople) {
            price /= 2;
        }
        System.out.println("주차 요금은 " + price + "원 입니다.");

    }
}
