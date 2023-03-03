package JavaStream;

import java.util.stream.Stream;

public class TraverseJavaArrays {
    public static void main(String[] args) {
        String[] names = {"Sachin","Dollar","Room"};

        //Stream to travers Array
        Stream.of(names).forEach(name->System.out.println(name));
    }
}
