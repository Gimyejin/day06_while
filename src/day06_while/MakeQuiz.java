package day06_while;

public class MakeQuiz {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int k = 1; k <= i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("==========================");
		for (int i = 0; i < 5; i++) {
			for (int k = 1; k <= i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >= 0; i--) {
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 0; i <5; i++) {
			for (int k = 0; k <= 5-i; k++) {
				System.out.print(" ");
			}
			for(int l=0;l<=i*2;l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
