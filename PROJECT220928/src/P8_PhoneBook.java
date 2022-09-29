// 4장 실습문제 8번

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name; this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public boolean equals(String query) {
        return name.equals(query);
    }
}

public class P8_PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int N = sc.nextInt();

        Phone[] phones = new Phone[N];

        for (int n = 0; n < N; n++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            phones[n] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        String query = "";
        while (true) {
            System.out.print("검색할 이름>>");
            query = sc.next();
            if (query.equals("그만")) break;

            int n = 0;
            for (; n < N; n++) {
                if (phones[n].equals(query)) {
                    System.out.println(query + "의 번호는 " + phones[n].getTel() + " 입니다.");
                    break;
                }
            }
            if (n == N)
                System.out.println(query + " 이 없습니다.");
        }
        sc.close();
    }
}
