// 7장 실습문제 2번

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P2 {

    static double charToScore(char c)
    {
        switch(c) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> scores = new ArrayList<>();

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
        for (int i = 0; i < 6; i++) {
            char score = sc.next().charAt(0);
            scores.add(score);
        }

        Iterator<Character> it = scores.iterator();
        double sum = 0;
        while (it.hasNext()) {
            char c = it.next();
            sum += charToScore(c);
        }
        sum /= scores.size();

        System.out.println(sum);
    }
}
