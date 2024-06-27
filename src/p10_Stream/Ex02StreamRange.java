package p10_Stream;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex02StreamRange {
  public static void main(String[] args) {
    // 1부터 5까지 랜덤한 숫자 찍기
    IntStream intStream = new Random().ints(1, 5);
    intStream.limit(5).forEach(new IntConsumer() {
      @Override
      public void accept(int x) {
        System.out.println(x);
      }
    });

    // 1이상 45미만까지 차례대로 숫자 찍기
    LongStream longStream = LongStream.range(1,45);
    longStream.forEach(new LongConsumer() {
      @Override
      public void accept(long value) {
        System.out.println(value);
      }
    });

    // 1이상 45이하 숫자 찍기
    IntStream intStream1 = IntStream.rangeClosed(1,45);
    intStream1.forEach(new IntConsumer() {
      @Override
      public void accept(int value) {
        System.out.println(value);
      }
    });

    // 0 부터 2씩증가 5개 찍기
    Stream<Integer> itrStream = Stream.iterate(0,n->n+2);
    itrStream.limit(5).forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println(integer);
      }
    });
    IntStream lottoStream = new Random().ints(1,46);
    lottoStream.distinct().limit(6).forEach(new IntConsumer() {
      @Override
      public void accept(int value) {
        System.out.printf("%3d", value);
      }
    });
  }
}
