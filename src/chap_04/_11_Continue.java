package chap_04;

public class _11_Continue {
    public static void main (String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 치킨나왔슴");


            if (i == noShow) {
                System.out.println(i + "번째 손님없나 ㅠ");
                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("판매완료");
                break;
            }

        }
        System.out.println("영업끝");
    }
}
