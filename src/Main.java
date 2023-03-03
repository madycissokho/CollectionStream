import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //use StreamSources.intNumbersStream() and StreamSources.userStream()

        //Print all numbers in the stringNumbersStream stream
        //StreamSources.stringNumbersStream().forEach(e -> System.out.println(e));
        StreamSources.stringNumbersStream().forEach(System.out::println);

        //Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().filter(number -> number < 5)
                .forEach(number -> System.out.println(number));

        //Print the second and third numbers in intNumbersStream that's greter than 5
        StreamSources.intNumbersStream().filter(number -> number >5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //Print the first number in intNumbersStream that's greater than 5
        Integer value = StreamSources.intNumbersStream().filter(number -> number > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(value);

    }
}