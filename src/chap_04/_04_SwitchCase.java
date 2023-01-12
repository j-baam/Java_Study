package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액장학금
        // 2등 : 반액장학금
        // 3등 : 반액장학금
        // 그 외  : 장학금 대상 아님

       /* int ranking = 1; // 1등
        if (ranking == 1) {
            System.out.println("전액 장학금" );
        }*/

        // Switch Case 문을 이용
       int ranking = 3;
        switch ( ranking ) {
            case 1:
                System.out.println("전액 장학금");
                break; // case1 만족하지 않으면 빠져나오기
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료");
        // case 2와 3을 통합
        ranking = 2;
        switch ( ranking ) {
            case 1:
                System.out.println("전액 장학금");
                break; // case1 만족하지 않으면 빠져나오기
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료");
    }

}
