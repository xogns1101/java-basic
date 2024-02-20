package basic.begin;

import java.util.Scanner;

public class CeltoFahr {

    public static void main(String[] args) {
        /*
         사용자에게 섭씨온도를 입력받아서
         화씨온도로 변환하여 출력하는 로직을 작성하세요.
         변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
         화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
         # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("온도를 입력하세요.('C): ");
        double cel = sc.nextDouble();

        double fahr = cel * 9/5 + 32;
        // 커밋되는지 확인용
        System.out.printf("입력한 섭씨: %.1f℃\n", cel);
        System.out.printf("변환한 화씨: %.1f℉\n", fahr);

        sc.close();
    }
    }

