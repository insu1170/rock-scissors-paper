package gugu1;

import java.util.Scanner;
import java.util.Random;

public class HomeWork1 {
	public static void main (String[] args) {
		play();
	}
	public static void play() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		String you = null;
		int num = 0;
		int q = 0;

		while(true) {
			System.out.println("무엇을 낼건가요: -가위- -바위- -보-");
			you = scanner.nextLine();
			System.out.printf("당신이 선택한 것은 -%s-" , you);
			System.out.println("맞으면 1번 틀리면 아무 숫자를 입력하세요!");
			q = scanner.nextInt();
			scanner.nextLine();
			if (q == 1) {
				break;
			}
		}
		switch(you) {
			case"가위":
				System.out.println("당신은 가위를 냈고");
				num=1;
				break;
			case"바위":
				System.out.println("당신 바위를 냈고");
				num=2;
				break;
			case"보":
				System.out.println("당신은 보를 냈고 ");
				num=3;
				break;
			default:
				System.out.println("똑바로 입력하세요.");
				return;
		}


		int com=random.nextInt(3) + 1;
		switch (com) {
			case 1:
				System.out.println("컴퓨터는 가위 결과는 ");
				break;
			case 2:
				System.out.println("컴퓨터는 바위 결과는 ");
				break;
			case 3:
				System.out.println("컴퓨터는 보 결과는 ");
				break;
			default:
				System.out.println("오류 오류");
		}
		if (num==1 && com==3) {
			System.out.println("당신의 승");
		} else if (num==3 && com==1) {
			System.out.println("당신의 패배");
		} else if (num>com) {
			System.out.println("너의 승리");
		} else if (num==com) {
			System.out.println("비겼습니다");
		} else {
			System.out.println("너의 패배");
		}
	}
}