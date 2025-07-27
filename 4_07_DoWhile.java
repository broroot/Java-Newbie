package Chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("발차기");
            System.out.println("현재 이동거리"+move);
            move +=3;
        }
        System.out.println("도착");

        System.out.println("----------------");
        // 키가 엄청 큰 사람
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기");
            System.out.println("현재 이동거리"+move);
            move +=3;
        }
        System.out.println("도착");

        System.out.println("-----------");

        // Do While 반복문
        // Do 를 일단 하고, While 수행
        do {
            System.out.println("발차기");
            System.out.println("현재 이동거리 :" + move);
            move += 3;
        } while (move+height < distance);
        System.out.println("도착");
    }
}
