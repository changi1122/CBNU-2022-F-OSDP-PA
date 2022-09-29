// 4장 Open Challenge

import java.util.Scanner;

class Player {
    private String name;
    public Player(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public String getWordFromUser(Scanner sc) {
        System.out.print(this.name + ">>");
        String word = sc.next();
        return word;
    }

    static boolean checkSuccess(String previousWord, String word) {
        return (previousWord.charAt(previousWord.length() - 1) == word.charAt(0));
    }
}

public class OpenChallenge {

    static String previousWord;
    static int N, turn = 0;
    static Player[] players;

    static boolean run(Scanner sc) {
        String word = players[turn].getWordFromUser(sc);
        if (Player.checkSuccess(previousWord, word))
            previousWord = word;
        else {
            System.out.print(players[turn].getName() + "이 졌습니다.");
            return true;
        }
        turn++;
        if (turn == N) turn -= N;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇 명입니까?");
        N = sc.nextInt();

        players = new Player[N];
        for (int n = 0; n < N; n++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = sc.next();
            players[n] = new Player(name);
        }

        previousWord = "아버지";
        System.out.println("시작하는 단어는 " + previousWord + "입니다.");
        while (true) {
            boolean isEnd = run(sc);
            if (isEnd)
                break;
        }
        sc.close();
    }
}
