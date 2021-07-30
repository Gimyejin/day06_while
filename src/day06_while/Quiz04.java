package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 로그인 프로그램
		Scanner input = new Scanner(System.in);
		String id = "",idConfirm="";
		String pw="",pwConfirm="";
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println(">>>>>");

			int number = input.nextInt();
			switch (number) {
			case 1:
				System.out.println("아이디 입력: ");
				idConfirm=input.next();
				System.out.println("패스워드 입력: ");
				pwConfirm = input.next();
				
				if(id.equals(idConfirm)&&pw.equals(pwConfirm)) {
					System.out.println("인증 성공");
				}else System.out.println("인증 실패!!");
				
				System.out.println();
				break;
			case 2:
				System.out.println("저장할 아이디 입력: ");
				id = input.next();
				System.out.println("저장할 패스워드 입력: ");
				pw = input.next();
				System.out.println("가입 완료");
				System.out.println();
				break;
			case 3:
				System.exit(1);
			}
		}

	}

}
