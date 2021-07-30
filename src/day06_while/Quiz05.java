package day06_while;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("요금을 투입하세요 >>>");
		int money = input.nextInt();
		int num;
		while (true) {
			System.out.println("========커피 자판기========\n");
			System.out.println("1.커피(200)\t2.코코아(250)\t 3.반환\t 4.종료");
			System.out.println("메뉴를 선택하세요 >>>");
			num = input.nextInt();
			switch (num) {
			case 1:
				if (money >= 200) {
					money -= 200;
					System.out.println("맛있게 드세요");
				} else
					System.out.println("요금이 부족합니다.");
				break;
			case 2:
				if (money >= 250) {
					money -= 250;
					System.out.println("맛있게 드세요");
				} else
					System.out.println("요금이 부족합니다.");
				break;
			case 3:
				System.out.println("거스름돈: " + money);
				break;
			case 4:
				System.exit(1);
			}
		}

	}

}
