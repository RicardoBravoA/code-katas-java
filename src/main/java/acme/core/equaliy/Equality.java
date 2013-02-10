package acme.core.equaliy;

public class Equality {

	public static void main(String[] args) {
		System.out.println(1 == 1); // true
		System.out.println(new Integer(1) == new Integer(1)); // false
		System.out.println(new Integer(1).equals(new Integer(1))); // true
		System.out.println("FOO" == "FOO"); // true
		System.out.println("FOO" == new String("FOO")); // false
		System.out.println("FOO".equals("FOO")); // true
		System.out.println("FOO".equals(new String(("FOO")))); // true
		System.out.println("FOO".hashCode() == new String("FOO").hashCode()); // true
	}

}
