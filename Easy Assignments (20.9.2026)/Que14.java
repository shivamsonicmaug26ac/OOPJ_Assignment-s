import java.util.*;

public class Que14 {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");

        System.out.println("TreeSet: " + set);

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());
    }
}