/*
 * 3장 실습문제 4번 : 소문자 알파벳 하나를 입력 받아 주어진 형태로 출력
 */

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alpha = sc.next().charAt(0);

        for (; 'a' <= alpha; alpha--) {
            for (char c = 'a'; c <= alpha; c++)
                System.out.print(c);
            System.out.println();
        }

        sc.close();
    }
}
