import java.util.*;

public class Que12 {

	public static void main(String[] args) {

		TreeSet<Integer> e1 = new TreeSet<>();
		TreeSet<Integer> e2 = new TreeSet<>();
		e1.add(10);
		e1.add(20);
		e1.add(30);

		e2.add(1);
		e2.add(2);
		e2.add(3);

		System.out.println("for set1: " + e1);
		System.out.println("for set2: " + e2);

		e2.addAll(e1);

		System.out.println("After adding e1 and e2 : " + e2);
	}

}
