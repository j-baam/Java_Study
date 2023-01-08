package chap_03;

public class _03_StringCompare {
    public static void main(String[] args)  {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Phython";

        System.out.println(s1.equals(s2)); // equals() <- 문자열이 같으면 "true", 다르면 "false"
        System.out.println(s2.equalsIgnoreCase("phython")); // equalsIgnoreCase() <- 대소문자 구분 x

        // 문자열 비교 심화
        s1 = "1234";                                      // 같은 메모리를 참조
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // == <- equals 역활

        s1 = new String("1234");                   //
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // false 참조가 다름 (다른 메모리에 저장이 되어있음)



    }
}
