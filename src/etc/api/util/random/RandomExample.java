package etc.api.util.random;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {

        Random r = new Random();

        // 실수 난수: 0.0 <= ~ < 1.0
        double d = r.nextDouble();
        System.out.println("d = " + d);

        // 정수 난수: nextInt();
        int i = r.nextInt(); // 기본 범위 : int 의 전범위 (약 -21억~ 약 21억)
        System.out.println("i = " + i);

        // 0~5까지의 정수 난수 생성 (끝 값이 미만으로 인식됨)
        int j = r.nextInt(6);
        System.out.println("j = " + j);

        // 10 ~ 100 까지의 정수 난수 생성
        int k = r.nextInt(91) + 10;
        System.out.println("k = " + k);

        boolean b = r.nextBoolean();
        System.out.println("b = " + b);


    }



}
