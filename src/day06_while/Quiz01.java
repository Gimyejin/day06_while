package day06_while;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1~10������ ���ڸ� �Է¹޾� 1���� �Է� ���� �������� ���� ���Ͻÿ�
		System.out.println("1~10������  �� �Է�: ");
		int num = input.nextInt();
		int sum = 0;
		if (num >= 1 && num <= 10) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
		} else
			System.out.println("�߸� �Է�. �ٽ� �Է��Ͻÿ�");

		System.out.println("10~20������ �� �Է�: ");
		int num2 = input.nextInt();
		int sum2 = 0;
		if (num2 >= 10 && num2 <= 20) {
			for (int i = 1; i <= num2; i++) {
				sum2 += i;
			}
		} else
			System.out.println("�߸� �Է�. �ٽ� �Է��Ͻÿ�");

		System.out.println("1���� " + num + "������ ��: " + sum);
		System.out.println("1���� " + num2 + "������ ��: " + sum2);
	}

}
