// 7장 실습문제 8번


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("** 포인트 관리 프로그램입니다 **");
        HashMap<String, Integer> points = new HashMap<>();

        while (true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = sc.next();
            if (name.equals("그만")) break;

            int point = sc.nextInt();

            if (points.containsKey(name))
                points.replace(name, point);
            else
                points.put(name, point);

            Set<String> keys = points.keySet();
            Iterator<String> it = keys.iterator();

            while (it.hasNext()) {
                name = it.next();
                System.out.print("(" + name + "," + points.get(name) + ")");
            }
            System.out.println();
        }

    }
}
