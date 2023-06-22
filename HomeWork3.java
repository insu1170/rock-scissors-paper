package gugu1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        StartGame();
    }

    public static void StartGame() {
        Random random = new Random();


        int result = 0;
        int plus = 0;
        ArrayList<String> userName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] K_Language = new String[2];
        System.out.println("몇 명이 플레이할 것입니까? 1, 2, 3 중 입력하십시오: ");
        int player = scanner.nextInt();
        while (player < 1 || player > 3) {
            System.out.println("잘못된 입력입니다. 1~3 중에서 다시 입력하세요.");
            player = scanner.nextInt();
        }

        for (int i = 0; i < player; i++) {
            System.out.println("당신의 이름을 입력하세요: ");
            String name = scanner.next();
            userName.add(name);
        }

        int com = 3 - player;
        for (int i = 0; i < com; i++) {
            userName.add("bot" + (i + 1));
        }

        System.out.print("당신들의 이름은");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" -%s-", userName.get(i));
        }
        String k1;
        String k2;
        int at = 0;
        int nat = 0;
        int df = 1;
        int ndf = 1;
        int pass = 0;
        int goal = 23;
        int[] korean = new int[2];

        System.out.printf(" \n점수가 %d를 넘기면 탈락입니다.\n 게임 시작!\n ",goal);

        while (true) {
             k1="";
             k2="";
            K_Language[0] = k1;
            K_Language[1] = k2;
            System.out.printf("\n 공격자는 -%s- 그리고 방어자는 -%s- 입니다\n", userName.get(at), userName.get(df));
            System.out.printf("공격자 -%s-는 무엇을 낼 것입니까? -1-가위 -2-바위 -3-보 \n", userName.get(at));

            if (userName.get(at).equals("bot1") || userName.get(at).equals("bot2")) {
                nat = random.nextInt(3) + 1;
            } else {
                nat = scanner.nextInt();
                while (nat < 1 || nat > 3) {
                    System.out.println("잘못된 입력입니다. 1~3 중에서 다시 입력하세요");
                    nat = scanner.nextInt();
                }
            }
            System.out.printf("방어자 -%s-는 무엇을 낼 것입니까? -1-가위 -2-바위 -3-보\n", userName.get(df));
            if (userName.get(df).equals("bot1") || userName.get(df).equals("bot2")) {
                ndf = random.nextInt(3) + 1;
            } else {
                ndf = scanner.nextInt();
                while (ndf < 1 || ndf > 3) {
                    System.out.println("잘못된 입력입니다. 1~3 중에서 다시 입력하세요");
                    ndf = scanner.nextInt();
                }
            }
            korean[0] = nat;
            korean[1] = ndf;
        for (int i=0;i<2;i++){
            switch(korean[i]) {
                case 1:
                    K_Language[i]="가위";
                    break;
                case 2:
                    K_Language[i]="바위";
                    break;
                case 3:
                    K_Language[i]="보";
                    break;

            }}
            System.out.printf("%s는 -%d:%s-  %s는 -%d:%s- 이므로 ", userName.get(at), nat,K_Language[0], userName.get(df), ndf,K_Language[1]);

            if (nat == 1 && ndf == 3) {
                System.out.println("공격자 승");
                if (userName.get(at).equals("bot1") || userName.get(at).equals("bot2")) {
                    pass = random.nextInt(2) + 1;
                    if (result > 19) {
                        pass = 2;
                    }
                    System.out.printf("숫자를 부를려면-1- 순서를 넘어갈려면-2- 공격자가 -%d- 냈습니다.\n", pass);
                } else {
                    System.out.println("숫자를 부를려면-1- 순서를 넘어갈려면 -2-를 입력하세요\n");
                    pass = scanner.nextInt();
                }
            } else if (nat == 3 && ndf == 1) {
                System.out.println("공격자 패배");
            } else if (nat > ndf) {
                if (userName.get(at).equals("bot1") || userName.get(at).equals("bot2")) {
                    pass = random.nextInt(2) + 1;
                    if (result > 19) {
                        pass = 2;
                    }
                    System.out.printf("공격자 승리 숫자를 부를려면-1- 순서를 넘어갈려면-2- \n 공격자가 -%d- 냈습니다.\n", pass);
                } else {
                    System.out.println("공격자 승리 \n숫자를 부를려면-1- 순서를 넘어갈려면 -2-를 입력하세요\n");
                    pass = scanner.nextInt();
                }
            } else if (nat == ndf) {
                System.out.println("비겼습니다.");
                pass = 20010602;
            } else {
                System.out.println("공격자의 패배");
            }

            if (pass == 2) {
                System.out.println("2번을 눌렸기 때문에 다음 순번으로 넘어 갑니다.");
            } else if (pass == 20010602) {
                System.out.println("숫자 몇을 올릴 것입니까? 1~3 중에서 입력하세요 비겼기 때문에 입력값*2 입니다");

                if (userName.get(at).equals("bot1") || userName.get(at).equals("bot2")) {
                    plus = random.nextInt(3) + 1;
                    System.out.printf("%d 를 입력 했고 ", plus);
                    plus *= 2;
                    System.out.printf("더해질 값은 %d 입니다.\n", plus);

                } else {
                    plus = scanner.nextInt();
                    while (plus < 1 || plus > 3) {
                        System.out.println("잘못된 입력입니다. 1~3 중에서 다시 입력하세요");
                        plus = scanner.nextInt();
                    }
                    System.out.printf("입력은 %d를 했고.", plus);
                    plus *= 2;
                    System.out.printf("더해질 값은 %d 입니다.", plus);
                }
            } else {
                System.out.println("숫자 몇을 올릴 것입니까? 1~3 중에서 입력하세요");
                if (userName.get(at).equals("bot1") || userName.get(at).equals("bot2")) {
                    plus = random.nextInt(3) + 1;
                    System.out.printf("%d", plus);
                } else {
                    plus = scanner.nextInt();
                    while (plus < 1 || plus > 3) {
                        System.out.println("잘못된 입력입니다. 1~3 중에서 다시 입력하세요");
                        plus = scanner.nextInt();
                    }
                }
            }

            result += plus;
            System.out.printf("\n 현재 점수는 -%d-입니다", result);

            if (result >= goal) {
                System.out.printf("\n 1차 게임 끝 탈락자는 %s 입니다 ", userName.get(at));
                userName.remove(at);
                break;
            }

            plus = 0;
            pass = 0;
            at++;
            df++;

            if (at == 3) {
                at = 0;
            }
            if (df == 3) {
                df = 0;
            }
        }

        System.out.printf("그리고 생존자는 -%s- -%s- 입니다. 두 번째 일반 가위 가위 보입니다. \n ", userName.get(0), userName.get(1));

        while (true) {
            System.out.printf("\n%s 무엇을 낼 것입니까? -1-가위 -2-바위 -3-보", userName.get(0));
            if (userName.get(0).equals("bot1") || userName.get(0).equals("bot2")) {
                nat = random.nextInt(3) + 1;
                System.out.printf("%d", nat);
            } else {
                nat = scanner.nextInt();
                while (nat < 1 || nat > 3) {
                    System.out.println("잘못된 입력입니다. 1~3 중에서 다시 입력하세요");
                    nat = scanner.nextInt();
                }
            }
            System.out.printf("\n%s 무엇을 낼 것입니까? -1-가위 -2-바위 -3-보 ", userName.get(1));

            if (userName.get(1).equals("bot1") || userName.get(1).equals("bot2")) {
                ndf = random.nextInt(3) + 1;
                System.out.printf("%d\n", ndf);
            } else {
                ndf = scanner.nextInt();
                while (ndf < 1 || ndf > 3) {
                    System.out.println("잘못된 입력입니다. 1~3 중에서 다시 입력하세요");
                    ndf = scanner.nextInt();
                }
            }

            k1="";
            k2="";
            K_Language[0] = k1;
            K_Language[1] = k2;
            korean[0] = nat;
            korean[1] = ndf;
            for (int i=0;i<2;i++){
                switch(korean[i]) {
                    case 1:
                        K_Language[i]="가위";
                        break;
                    case 2:
                        K_Language[i]="바위";
                        break;
                    case 3:
                        K_Language[i]="보";
                        break;}}


            System.out.printf("\n -%s-는 -%d:%s- 를 냈고 %s는 -%d:%s-를 냈습니다. 결과는 ", userName.get(0),nat,K_Language[0],userName.get(1),ndf,K_Language[1]);


            if (nat == 1 && ndf == 3) {
                System.out.printf("\n -%s-의 최종 승리", userName.get(0));
                break;
            } else if (nat == 3 && ndf == 1) {
                System.out.printf("%s의 최종 승리", userName.get(1));
                break;
            } else if (nat > ndf) {
                System.out.printf("%s 최종 승리", userName.get(0));
                break;
            } else if (nat == ndf) {
                System.out.printf("비겼습니다 다시");
            } else {
                System.out.printf("%s 최종 승리\n", userName.get(1));
                break;
            }
        }
    }
}