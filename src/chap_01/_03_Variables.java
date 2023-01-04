//변수
package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "j-baam"; //문자열 변수선언
        //name = "j-baam";      //name 선언
        int hour = 11;          //정수형 변수선언 int

        System.out.println(name + "님, 배송이 시작됩니다."+ hour +"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;            //실수형 변수선언 double
        char grade = 'A';               //한글자만 표현할때 char
        name = "범범";                   //name 변수 업데이트
        System.out.println(name + "님의 평균점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = true; //불리안 변수
        System.out.println("이번시험에 합격했을까요? " + pass);

        double d = 3.14123456789; //정밀한 자료형 double
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l= 1000000000000l; //int형 한계가있음(21억) //long은 int 보다 넓은 범위
        l = 1_000_000_000_000l;
        System.out.println(l);
        //int, long, float, double, char, String, boolean 등 사용하는 범위에 맞는 자료형을 써야함!!

    }
}
