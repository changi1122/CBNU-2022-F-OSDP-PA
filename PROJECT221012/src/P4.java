// 7장 실습문제 4번


import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> drops = new Vector<>();
        Iterator<Integer> it;
        double dropSum = 0;

        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int drop = sc.nextInt();
            if (drop == 0) break;

            drops.add(drop);
            dropSum += drop;

            it = drops.iterator();
            while (it.hasNext())
                System.out.print(it.next() + " ");
            System.out.println("\n현재 평균 " + dropSum / drops.size());
        }
    }
}
