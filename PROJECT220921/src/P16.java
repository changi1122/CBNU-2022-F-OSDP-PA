/*
 * 3장 실습문제 16번 : 가위 바위 보 게임
 */

import java.util.Scanner;

public class P16 {
    static enum Result { UserWin, ComputerWin, NotDecided };

    public static void main(String[] args) {
        String[] computer = { "가위", "바위", "보" };
        Scanner sc = new Scanner(System.in);

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while (true) {
            System.out.print("가위 바위 보!>>");
            String user = sc.next();
            if (user.equals("그만")) break;

            int select = (int)(Math.random() * 10) % 3;
            Result result;

            if (user.equals("가위")) {
                if (computer[select].equals("가위"))
                    result = Result.NotDecided;
                else if (computer[select].equals("바위"))
                    result = Result.ComputerWin;
                else
                    result = Result.UserWin;
            }
            else if (user.equals("바위")) {
                if (computer[select].equals("가위"))
                    result = Result.UserWin;
                else if (computer[select].equals("바위"))
                    result = Result.NotDecided;
                else
                    result = Result.ComputerWin;
            }
            else { // user: "보"
                if (computer[select].equals("가위"))
                    result = Result.ComputerWin;
                else if (computer[select].equals("바위"))
                    result = Result.UserWin;
                else
                    result = Result.NotDecided;
            }

            System.out.print("사용자 = " + user + " , 컴퓨터 = " + computer[select] + ", ");
            if (result == Result.UserWin)
                System.out.println("사용자가 이겼습니다.");
            else if (result == Result.ComputerWin)
                System.out.println("컴퓨터가 이겼습니다.");
            else
                System.out.println("비겼습니다.");
        }

        sc.close();
    }
}
