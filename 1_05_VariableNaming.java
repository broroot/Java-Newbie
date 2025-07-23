package Chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능   (* 공백 사용 불가)
        // 3. 숫자로는 시작 불가
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫단어 제외)
        // 6. ???예약어??? 사용 불가 (public, static, void, int, double 등)

        // 입국 신고서
        String nationality = "대한민국"; //국적
        String first_Name = "형근"; //이름
        String last_Name = "김"; //성
        String date_Of_Birth = "1997-10-18"; //생년월일
        String residentialAddress = "아나 호텔"; //체류지
        String purposeOfVisit = "관광"; //입국목적

        int accompany = 2; //동반인 수

        String item1 = "시계";
        String item2 = "가방";

        // 상수 (잎에 final) : 절대 변하지 않는 것 (업데이트 불가) => 대문자로
        final String CODE = "KR";
    }

}
