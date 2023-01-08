package chap_03;

public class _04_EscapeSequnence {
    public static void main(String[] args)  {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)

        // \n (줄 바꿈)
        System.out.println("자바가\n너무\n재밌어요");

        // \t (칸 맞춤(탭))
        System.out.println("물\t\t1500원");
        System.out.println("과자\t\t2000원");
        System.out.println("아이스\t1500원");

        // \\ (역슬래시)
        System.out.println("C:\\Program Files\\Java"); // \ 하나만 작성하면 안됨

        // \" (큰따옴표)
        System.out.println("단비가 \"냐옹\" 이라고 했어요."); // 문자열 사이에서 ""을 사용하고싶을때 ""앞에 \

        // \' (작은따옴표) -> char 자료형
        System.out.println("단비가 \'뭘봐\' 라고 했어요.");

        char c = 'A';
        c = '\'';
        System.out.println(c);

    }
}
