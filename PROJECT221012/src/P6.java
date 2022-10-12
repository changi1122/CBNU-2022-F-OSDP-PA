// 7장 실습문제 6번

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location {
    public String name;
    public int latitude;
    public int lognitude;

    public Location(String name, int latitude, int lognitude) {
        this.name = name; this.latitude = latitude; this.lognitude = lognitude;
    }
}

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Location> citys = new HashMap<>();

        System.out.println("도시, 경도, 위도를 입력하세요");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String line = sc.nextLine();
            String[] props = line.split(",");
            citys.put(props[0].trim(), new Location(
                    props[0].trim(),
                    Integer.parseInt(props[1].trim()),
                    Integer.parseInt(props[2].trim())
            ));
        }

        System.out.println("-------------------------------");

        Set<String> keys = citys.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            Location l = citys.get(it.next());
            System.out.println(l.name + " " + l.latitude + " " + l.lognitude);
        }

        System.out.println("-------------------------------");

        String query;
        while (true)
        {
            System.out.print("도시 이름 >> ");
            query = sc.next();
            if (query.equals("그만")) break;

            Location l = citys.get(query);

            if (l == null)
                System.out.println(query + "는 없습니다.");
            else
                System.out.println(l.name + " " + l.latitude + " " + l.lognitude);
        }
    }
}
