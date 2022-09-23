/*
 * 3장 Open Challenge
 */

import java.util.Scanner;

public class OpenChallenge {
    static void game(Scanner sc)
    {
        int selected = (int)(Math.random() * 100);
        System.out.println("수를 결정하였습니다. 맞추어 보세요");

        int queryCount = 1, query;
        while (true) {
            System.out.print(queryCount + ">>");
            query = sc.nextInt();

            if (query < selected)
                System.out.println("더 높게");
            else if (selected < query)
                System.out.println("더 낮게");
            else {
                System.out.println("맞았습니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String retryRequested;
        do {
            game(sc);
            System.out.print("다시하시겠습니까(y/n)>>");
            retryRequested = sc.next();
        } while(retryRequested.equals("y"));

        sc.close();
    }
}
