package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;

        num = num+2;
        System.out.println(num);

        // 복합 대인 연산자
        num = 10;

        num += 2; // num = num + 2 랑 같음
        System.out.println(num);

        num /= 2;
        System.out.println(num);

    }
}
