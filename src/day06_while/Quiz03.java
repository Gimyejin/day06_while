package day06_while;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		int rice = 100000;
		int mouse = 2;
		int day = 1;
		while (true) {
			rice = rice - (mouse * 20);// ���� �� ����ŭ �� ������
			if (rice < 0)
				break;
			day++;
			if (day % 10 == 0)
				mouse *= 2;
		}
		System.out.println("�� ���� �ϼ�: " + day + " �� ������: " + mouse);

	}

}
