package _05_for_loops._2_badgers;

public class Badger {
	public static void main(String[] args) {

		for (int verse = 0; verse < 2; verse += 1) {
			for (int badger = 0; badger < 12; badger += 1) {
				System.out.print("badger, ");

			}
			System.out.println();
			for (int mushroom = 0; mushroom < 2; mushroom += 1) {
				System.out.print("mushroom, ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.print("a snake!!!,");
	}
}