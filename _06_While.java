package Chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        // 수영장
        int distance = 25;  // 전체거리
        int move = 0;       // 현재 이동거리
        while (move < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println(("현재 이동 거리 : " + move));
            move += 3;
        }
        System.out.println("도착하였습니다.");
    }
}
