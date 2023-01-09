package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 15;
        if (hour <14){
            System.out.println(hour+ "시 입니다");
        }
        else {
            System.out.println(hour+ "시 입니다2.");
        }

        // 오후 2시 이후거나 모니 커피를 마신경우?
        hour = 12;
        boolean MC = false;
        if (hour > 14 || MC){
            System.out.println("커피 ㄴㄴ");
        }
        else {
            System.out.println("커피 ㄱㄱ");
        }
    }
}
