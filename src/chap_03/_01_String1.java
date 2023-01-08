// 문자열
package chap_03;

public class _01_String1 {
    public static void main(String[] args)  {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // <- length() 문자열의 길이

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // <- toUpperCase 대문자로 변경
        System.out.println(s.toLowerCase()); // <- toLowerCase 소문자로 변경

        // 포함 관계
        System.out.println(s.contains("Java")); // <- contains() 괄호안의 입력한 것이 있으면 true출력
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java")); // <- 입력한 문자열의 위치
        System.out.println(s.indexOf("C#")); // <- -1일때 포함되지않는다는 의미
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and")); // <- lastIndexOf() 마지막으로 일치하는 정보


    }
}
