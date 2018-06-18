package ec.com.ocpjp.exam;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise.strEqual();
		
		
	}

	private static void strEqual() {
		String s1 = "hi";
		String s2 = new String("hi");
		String s3 = "hi";

		if (s1 == s2) {
			System.out.println("s1 and s2 equals");
		} else {
			System.out.println("s1 and s2 not equals");

		}
		
		if (s1 == s3) {
			System.out.println("s1 and s3 equals");
		} else {
			System.out.println("s1 and s3 not equals");

		}

	}

}
