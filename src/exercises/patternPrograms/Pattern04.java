package exercises.patternPrograms;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Pattern04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Diamond shape composed of Numbers

		for (int i = 1; i <= 4; i++) {
			int n = 4;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		for (int i = 3; i >= 1; i--) {
			int n = 3;
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
