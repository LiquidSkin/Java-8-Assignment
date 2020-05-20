import java.util.*;
import java.util.stream.IntStream;

public class AverageStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 10, 2, 3, 20, 17, 14, 5, 7, 12, 9, 5);
        OptionalDouble avg = intStream.average();
        System.out.println("The average of the numbers in the stream is" + " " +  avg.getAsDouble());

    }
}

