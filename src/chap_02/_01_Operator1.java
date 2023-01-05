// 연산자

package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자 (계산)

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println((double) 5 / 2);
        System.out.println((double) 2 / 4);
        System.out.println(4 % 2); // % 나머지 연산
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 4);
        System.out.println((2 + 2)* 4);
        System.out.println(2+ (2 * 4));

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);




    }
}
