package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동거리 0m
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println();
            move += 3;
        }
        System.out.println("----");
        // 키가 엄청나게 큰 사람
        move = 0;
        height = 3; // 키가 25m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("이동거리 " + move);
            System.out.println();
            move += 3;
        }
        System.out.println("---------------");
        // Do While 반복문
        do { // 일단 한번실행함
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;


        } while (move + height < distance);
        System.out.println("도착했습니다.");

    }

}


