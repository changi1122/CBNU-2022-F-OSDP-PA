/*
 * 3장 실습문제 6번 : 화폐 변환
 */

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

        System.out.print("금액을 입력하세요>>");
        int money = sc.nextInt();

        for (int u : unit) {
            int count = (int) (money / u);
            if (count != 0)
                System.out.println(u + "원 짜리 : " + count + "개");
            money %= u;
        }

        sc.close();
    }
}
