package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25;
        int move = 0;

        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리는 : "+ move);
            move  += 3; // 3미터 이동;

        }
        // 무한 루프
        move = 0;
        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리는 : "+ move);
        }
        System.out.println("도착하였습니다.");
    }
}
