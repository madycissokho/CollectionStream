package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        //print even numbers using Stream API
        List<Integer> numbers =
                new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,7,8,9));
        List<Integer> evenNumbers = numbers.stream()
                .filter(n->n%2==0)
                .map(n ->n * n)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
