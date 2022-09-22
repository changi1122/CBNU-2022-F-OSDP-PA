/*
 * 3장 실습문제 10번 : 정수 배열 생성 후 삽입
 */

import java.util.Scanner;

public class P10 {
    static void fillArray(int[][] arr) {
        int filled = 0;
        while (filled < 10) {
            int number = (int)(Math.random() * 10 + 1);
            int r = (int)(Math.random() * 10) % 4;
            int c = (int)(Math.random() * 10) % 4;

            if (arr[r][c] == 0) {
                arr[r][c] = number;
                filled++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        fillArray(arr);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        sc.close();
    }
}
