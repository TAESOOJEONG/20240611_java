package p08_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex01Byte {
  public static void main(String[] args) {
    byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    byte[] outSrc = null;

    // InputStream 은 프로세스 안으로 들어오는 것
    // OutPutStream 은 프로세스 밖으로 나가는 것
    ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.out.println(Arrays.toString(inSrc));

    int data;
    while ((data = input.read()) != -1) {
      output.write(data); // 총 10번의 스트림 생성
    }
    outSrc = output.toByteArray();
    System.out.println(Arrays.toString(outSrc));

    byte[] tmp = new byte[4];
    input = new ByteArrayInputStream(inSrc);
    while (input.available()>0){
      try {
        // input 을 읽어서 tmp 에 담음, read 읽은 글자수를 반환
        int length = input.read(tmp);
        output.write(tmp);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

    }
  }
}
