package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간.
        String coffeeA = "아메리카노";
        String coffeeB = "카페모카";
        String coffeeC = "라떼";
        String coffeeD = "카푸치노";

        System.out.println(coffeeA + " 하나");
        System.out.println(coffeeB + " 하나");
        System.out.println(coffeeC + " 하나");
        System.out.println(coffeeD + " 하나");
        System.out.println("주세요 ");

        // 배열 선언 첫 번째 방법
        String[] coffees = new String[4];

        // 두 번째 방법
        /* String coffees[] = new String[4]; */
        coffees[0] = "아메리카노"; // 0 부터 시작
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";


    }
}
