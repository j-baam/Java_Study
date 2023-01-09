package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 망고 주스가 있으면 +1
        // 아이스 아메리카노 +1

        boolean a = false;
        boolean b = false;

        if (a) {
            System.out.println("한라봉에이드 +1");
        } else if (b) {
            System.out.println("망고주스 +1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료 #1");

    }
}

