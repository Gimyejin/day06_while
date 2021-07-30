package day06_while;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num = 1;
		for (int i = 1; i <= 30; i++) {
			sum += num;
			num = sum;
		}
		System.out.println("30일째 되는 날 예금 금액: " + sum);

		// 1~1000까지의 합(단 3의 배수 제외, 3의배수이면서 5의 배수는 제외X)
		int sum1 = 0;
		for (int i = 1; i <= 1000; i++) {
			int dontsum = 0;
			if (i % 5 == 0 && i % 3 == 0) {
				sum1 += i;
			} else if (i % 3 == 0) {
				dontsum++;
			} else
				sum1 += i;
		}
		System.out.println("sum: " + sum1);

		int sum2 = 0;
		int num1 = 0;
		while (true) {
			if (sum2 >= 10000)
				break;
			num1++;
			if (num1 % 2 != 0) {
				sum2 += num1;
				
			}
			if (sum2 >= 10000) {
				break;
			}
		}
		System.out.println("10000이하의 홀수 합: " + num1);
	}

}
