// 형 변환

package chap_01;

import java.sql.SQLOutput;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형
        // 실수형에서 정수형

        //int score = 93 + 93.5; //결과가 double(실수)형태인데  int(정수)형으로 받아 오류 

    // int to float, double
    int score = 93;
    System.out.println(score);         // 93
    System.out.println((float) score); // 형 변환을 위해 앞에 ()을 넣어 변환 93.0
    System.out.println((double) score); // 93.0

    //float, double to int
    float score_f = 93.3F;
    double score_d = 98.8;
    System.out.println((int) score_f); // 93
    System.out.println((int) score_d); // 98

    // 정수 + 실수 연산
    score = 93 +(int) 98.8;            // 93 + 98
    System.out.println(score);         // 191

    score_d = (double) 93 + 98.8;      // 자동으로 앞에있는게 실수형으로 변환
    System.out.println(score_d);       // 191.8

    // 변수에 형변환된 데이터 집어넣기
    double convertedScoreDouble = score; // 191 -> 191.0

    // int -> long -> float -> double (자동 형변환)


    int convertedScoreINt = (int) score_d; // 191.8 -> 191  큰 데이터범윙에서 작은데이터범위로 가면 에러가뜸 (int를 붙혀줌으로서 실수에서 정수형으로 변환)
    // double -> float -> long -> int (수동 형변환 (작은거로 줄어들때))

    // 숫자를 문자열로
    String s1 = String.valueOf(93);     // String 이라는 클래스가 제공해주는 ValueOf 를 사용하여 실수형 93을 문자열로 변환
    s1 = Integer.toString(93);          // toString 정수를 문자열로 바꿔줌
    System.out.println(s1);               // 93

    String s2 = String.valueOf(98.8);
    s2 = Double.toString(98.8);
    System.out.println(s2);

    // 문자열을 숫자로
    int i = Integer.parseInt("93");
    System.out.println(i);
    double d = Double.parseDouble("98.8");
    System.out.println(d);


    }



}

