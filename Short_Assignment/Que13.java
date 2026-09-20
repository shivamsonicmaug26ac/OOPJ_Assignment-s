import java.util.TreeSet;

public class Que13 {

	public static void main(String[] args) {

		TreeSet<String> e1 = new TreeSet<>();

		e1.add("10");
		e1.add("20");
		e1.add("30");
		e1.add("40");

		System.out.println("for set1: " + e1);

		System.out.println("After adding e1 and e2 : " + e1.descendingSet());
	}

}
