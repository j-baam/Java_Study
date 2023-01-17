package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리)
        // 손님 50명

        // for문
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 치킨이요");
            if(i == 20)
                break; // 반복문 탈출
        }
        System.out.println("영업종료");

        System.out.println("=====================");

        // while 문
        int index = 1; //손님
        while (index <= 50) {
            System.out.println(index + "번 손님 치킨입니다");
            if (index == max) {
                System.out.println("재료 소진");
                break;
            }
            index++;
        }
        System.out.println("재료소진 @@@@@@@@@@@@@");

    }
}
