package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // replace("바꿀 문장", "바꿀거") <- 바꾸려고 하는 문자열
        System.out.println(s.substring(7)); // substring(시작할 위치)7 부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        // "Java" 가 시작하는 위치부터, "Phython"이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Python"))); // 끝 위치는 출력하지않음.

        // 공백 제거
        s = "              I         Like you   ";
        System.out.println(s);
        System.out.println(s.trim()); // trim() <- 공백제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Phyton";
        System.out.println(s1 + s2);
        System.out.println(s1 + " . " + s2);
        System.out.println(s1.concat(",").concat(s2));


    }
}
