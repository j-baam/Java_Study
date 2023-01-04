package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자로 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "준범"; // 이름
        String lastName = "이"; // 성
        String dateOfBirth = "2001-06-04"; // 생일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "방문 목적"; // 입국목적
        String flightNO = "KE634"; // 항공편
        String _flightNo = "KE634"; // 밑줄 시작
        String flight_no_2 = "KE634"; // 밑줄과 숫자 포함
        //String -flightNO = "KE634"; // -로 시작하면 안됨

        int accompany = 2; // 동반 가족 수
        int lengtOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "전자 제품"; // 숫자로 시작하면 안됨

        // 프로그램의 흐름으르 위해 사용되는 경우 등
        int i = 0;
        String s = "";   // 간단하게 작성
        String str = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR"; // final로 값을 주면 변할수 없음
    }
}
