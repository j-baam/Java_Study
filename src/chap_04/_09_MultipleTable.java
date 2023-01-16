package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2단


        for (int i = 0; i <= 10 ; i++) {
            int number = 2;
            int sum = number * i;
            System.out.println(number + "*" + i +" 의 값은 = "+ sum);

        }
        for (int i = 0; i <= 10 ; i++) {
            int number = 6;
            int sum = number * i;
            System.out.println(number + "*" + i +" 의 값은 = "+ sum);

        }
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j +   " = "+ (i*j));

            }
            System.out.println();

        }
    }
}
