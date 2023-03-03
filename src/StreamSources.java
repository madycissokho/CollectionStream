import java.util.stream.Stream;

public class StreamSources {
    public static Stream<String> stringNumbersStream(){
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

    }
    public static Stream<Integer> intNumbersStream(){
        return Stream.iterate(0, i -> i + 2).limit(10);
    }

}
