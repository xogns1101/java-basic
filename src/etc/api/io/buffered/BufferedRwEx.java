package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedRwEx {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            text.append(i + "안녕하세요!\n");
        }

        try(FileWriter fw = new FileWriter("C:\\Myworkspace\\hello.txt");
            BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(new String(text)); // 문자 기반 스트림이기 때문에 문자열 그대로 전달.

            System.out.println("파일 정상 출력 완료!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try(FileReader fr = new FileReader("C:\\Myworkspace\\hello.txt");
            BufferedReader br = new BufferedReader(fr)) {

            // BufferedReader 에는 readLine() 메서드가 있고
            // 한줄을 통째로 읽어서 String 으로 리턴합니다.
            // 더 이상 읽어들일 데이터가 없다면 null 을 리턴.

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

            System.out.println("파일 읽기 완료!");

        } catch (Exception e) {
            e.printStackTrace();
        }





    }




}
