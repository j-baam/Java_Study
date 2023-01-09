package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 13; // 오후 1시

        if (hour < 11) // 중괄호 {}로 묶기 가능
        {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        hour = 10;
        boolean moringcoffee = false; // 모닝 커피
        // if (hour <14 && moringcoffee == false){ // && <- 모두 만족할때
        if (hour <14 && !moringcoffee){ // moringcoffee 값이 false일때 앞에 !
            System.out.println("아이스 아메리카노");
        }
        System.out.println("커피주문 완료");




    }
}
