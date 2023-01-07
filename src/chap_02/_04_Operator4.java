package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true; // boolean 은 참(true) 또는 거짓(false) 를 구분하는 자료형
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 ); // || 는 또는(or) 을 뜻함 // 하나라도 true면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // && 는 그리고(and) 를 의미하며 모두 만족해야함 // 하나라도 flase이면 false

        // and연산
        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 <= 1));

        // or연산
        System.out.println((5 > 3) || (3 <= 1)); // 하나라도 만족시키면 true
        System.out.println((5 < 3) || (3 < 1));  // 둘 다 만족시키지못하면 false

        // 논리 부정 연산자 (true면 false값 출력 (반대값 출력))
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5));
        System.out.println(!( 5 == 3));

    }
}
