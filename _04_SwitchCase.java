package Chap_04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 1등 : 전액 장학금
        // 2등, 3등 : 반액 장학금
        // 그 외 : 장학금 없음

        // If, Else 이용
        int rank = 4;
        if (rank==1) {
            System.out.println("전액 장학금");
        } else if (rank == 2 || rank == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 이용
        rank = 3;
        switch (rank) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고 상품 등급에 따른 가격 책정
        int grade = 3;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
    }
}
