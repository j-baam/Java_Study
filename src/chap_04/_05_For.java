package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요, 나코입니다.");
        // 또다른 손님이 들어올때
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장의 이름이 바뀌면?
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다. ");

        // 반복문 사용 For
        for ( int i = 0; i < 10; i++) {
            // System.out.println("어서오세요. 나코입니다. " + i);
        }

        // 짝수만 출력
        for ( int i = 0; i < 20; i += 2) {
            System.out.println(i);
        }

        // 1부터 10까지의 수들의 합
        int sum = 0;
        for ( int i = 1; i < 11; i++) {
            sum += i;
            System.out.println(sum);
        }

    }
}
