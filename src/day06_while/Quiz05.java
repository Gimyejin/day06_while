package day06_while;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����� �����ϼ��� >>>");
		int money = input.nextInt();
		int num;
		while (true) {
			System.out.println("========Ŀ�� ���Ǳ�========\n");
			System.out.println("1.Ŀ��(200)\t2.���ھ�(250)\t 3.��ȯ\t 4.����");
			System.out.println("�޴��� �����ϼ��� >>>");
			num = input.nextInt();
			switch (num) {
			case 1:
				if (money >= 200) {
					money -= 200;
					System.out.println("���ְ� �弼��");
				} else
					System.out.println("����� �����մϴ�.");
				break;
			case 2:
				if (money >= 250) {
					money -= 250;
					System.out.println("���ְ� �弼��");
				} else
					System.out.println("����� �����մϴ�.");
				break;
			case 3:
				System.out.println("�Ž�����: " + money);
				break;
			case 4:
				System.exit(1);
			}
		}

	}

}
