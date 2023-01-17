package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 정산
        // 시간당 4000원 (일일 최대요금은 30000원)
        // 경차, 장애인 최종요금 50퍼할인

        //일반차랑 5시간 주차시 20000원
        //경차 5시간 10000원
        //장애인차량 10시간 15000원
    int hour = 4;
    boolean small = true;
    boolean disable = false;

    int fee = hour * 4000;

    if (fee > 30000){
        fee =30000;
        // System.out.println("요금은 30000원 입니다.");
    }
    if (small || disable) {
        fee /= 2;

        }
        System.out.println("주차요금은" + fee + "입니다");

    }
}
