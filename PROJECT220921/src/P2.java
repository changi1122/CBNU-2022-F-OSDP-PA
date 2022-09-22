/*
 * 3장 실습문제 2번 : 주어진 2차원 배열을 출력하는 프로그램 작성
 */

public class P2 {
    public static void main(String[] args) {

        // 주어진 배열 n
        int[][] n = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1, 2} };

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++)
                System.out.print(n[i][j] + " ");
            System.out.println();
        }
    }
}
