public class RandomTest {

	public static void main(String[] args) {

		java.util.Random rnd = new java.util.Random();

		double sum = 0.0;

		for (int i = 0; i < 1000000; i++) {
			sum += rnd.nextDouble();
		}

		System.out.println("mean = " + sum / 1000000.0);
	}
}