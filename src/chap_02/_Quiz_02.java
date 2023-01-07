package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int height = 121;
        int standard = 120;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다.";

        System.out.println("키가 " + height + " 이므로" + result);

        // System.out.println(height >= standard ? "키가 " + height + " 이므로 탑승 가능합니다." : "키가 " + height + " 이므로 탑승 불가능합니다.");
    }
}
