package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// �α��� ���α׷�
		Scanner input = new Scanner(System.in);
		String id = "",idConfirm="";
		String pw="",pwConfirm="";
		while (true) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.println(">>>>>");

			int number = input.nextInt();
			switch (number) {
			case 1:
				System.out.println("���̵� �Է�: ");
				idConfirm=input.next();
				System.out.println("�н����� �Է�: ");
				pwConfirm = input.next();
				
				if(id.equals(idConfirm)&&pw.equals(pwConfirm)) {
					System.out.println("���� ����");
				}else System.out.println("���� ����!!");
				
				System.out.println();
				break;
			case 2:
				System.out.println("������ ���̵� �Է�: ");
				id = input.next();
				System.out.println("������ �н����� �Է�: ");
				pw = input.next();
				System.out.println("���� �Ϸ�");
				System.out.println();
				break;
			case 3:
				System.exit(1);
			}
		}

	}

}
