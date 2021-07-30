package day06_while;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1~10사이의 숫자만 입력받아 1부터 입력 받은 수까지의 합을 구하시오
		System.out.println("1~10사이의  수 입력: ");
		int num = input.nextInt();
		int sum = 0;
		if (num >= 1 && num <= 10) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
		} else
			System.out.println("잘못 입력. 다시 입력하시오");

		System.out.println("10~20사이의 수 입력: ");
		int num2 = input.nextInt();
		int sum2 = 0;
		if (num2 >= 10 && num2 <= 20) {
			for (int i = 1; i <= num2; i++) {
				sum2 += i;
			}
		} else
			System.out.println("잘못 입력. 다시 입력하시오");

		System.out.println("1부터 " + num + "까지의 합: " + sum);
		System.out.println("1부터 " + num2 + "까지의 합: " + sum2);
	}

}
