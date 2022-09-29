// 4장 실습문제 12번

import java.util.Scanner;

enum ChairType {
    S, A, B
};

class Concert {
    String[][] chairs;
    public Concert() {
        chairs = new String[ChairType.values().length][10];
        for (int i = 0; i < ChairType.values().length; i++)
            for (int j = 0; j < 10; j++) {
                chairs[i][j] = "---";
            }
    }

    public void reserve(ChairType type, String name, int num) throws Exception {
        num--;
        if (num < 0 || 10 <= num)
            throw new Exception("없는 좌석 번호입니다.");
        if (!chairs[type.ordinal()][num].equals("---"))
            throw new Exception("이미 예약된 좌석입니다.");

        chairs[type.ordinal()][num] = name;
    }

    public void showAll() {
        for (int i = 0; i < ChairType.values().length; i++) {
            System.out.print(ChairType.values()[i] + ">> ");
            for (int j = 0; j < 10; j++)
                System.out.print(chairs[i][j] + " ");
            System.out.println();
        }
    }

    public void show(ChairType type) {
        System.out.print(type + ">> ");
        for (int j = 0; j < 10; j++)
            System.out.print(chairs[type.ordinal()][j] + " ");
        System.out.println();
    }

    public void cancel(ChairType type, String name) throws Exception {
        int target = -1;
        for (int j = 0; j < 10; j++) {
            if (chairs[type.ordinal()][j].equals(name)) {
                target = j;
                break;
            }
        }
        if (target == -1)
            throw new Exception("예약되지 않은 이름입니다.");

        chairs[type.ordinal()][target] = "---";
    }
}

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Concert concertSystem = new Concert();
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        int command, type;
        ChairType chairType;
        while (true)
        {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            command = sc.nextInt();

            if (command == 4) {
                break;
            }
            else if (command == 1) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                type = sc.nextInt();
                if (type == 1)
                    chairType = ChairType.S;
                else if (type == 2)
                    chairType = ChairType.A;
                else if (type == 3)
                    chairType = ChairType.B;
                else {
                    System.out.println("잘못된 좌석구분입니다.");
                    continue;
                }

                System.out.print("이름>>");
                String name = sc.next();
                System.out.print("번호>>");
                int num = sc.nextInt();
                try {
                    concertSystem.reserve(chairType, name, num);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else if (command == 2) {
                concertSystem.showAll();
                System.out.println("<<<조회를 완료하였습니다.>>>");
            }
            else if (command == 3) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                type = sc.nextInt();
                if (type == 1)
                    chairType = ChairType.S;
                else if (type == 2)
                    chairType = ChairType.A;
                else if (type == 3)
                    chairType = ChairType.B;
                else {
                    System.out.println("잘못된 좌석구분입니다.");
                    continue;
                }

                concertSystem.show(chairType);
                System.out.print("이름>>");
                String name = sc.next();
                try {
                    concertSystem.cancel(chairType, name);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else
                System.out.println("없는 메뉴 입니다.");
        }

        sc.close();
    }
}
