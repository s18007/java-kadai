public class En2_2 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			String s = String.valueOf(i);
			if (i % 3 == 0 || s.contains("3")) {
				System.out.println("THREE");
			} else {
				System.out.println(i);
			}
		}
	}
}
