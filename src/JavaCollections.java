import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);
//        System.out.println("Before Sort" + al);
//        Collections.sort(al);
//        System.out.println("After Sort" + al);
        Collections.reverse(al);
        System.out.println("After reverse" + al);
    }
}
