package days05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int com, user;
        char con = 'y';

        Scanner scanner = new Scanner(System.in);

        do {

            com = (int)(Math.random() * 3) + 1;

            System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
            user = scanner.nextInt();

            switch (com - user) {

                case 0:
                    System.out.println("무승부");
                    break;

                case -1:
                case 2:
                    System.out.println("사용자 승리");

                    System.out.print("게임 또 할래? ");
                    con = scanner.next().charAt(0);

                    break;

                case 1:
                case -2:
                    System.out.println("컴퓨터 승리");
                    con = 'n';
                    break;
            }

        } while (con == 'y' || con == 'Y');

        System.out.println("게임 종료");
    }
}