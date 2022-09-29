// 4장 실습문제 10번

import java.util.Scanner;

class Dictionary {
    private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String[] eng = { "love", "baby", "money", "future", "hope" };

    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word))
                return eng[i];
        }
        return null;
    }
}

public class P10_DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("한영 단어 검색 프로그램입니다.");
        String query;
        while (true) {
            System.out.print("한글 단어?");
            query = sc.next();
            if (query.equals("그만")) break;

            String result = Dictionary.kor2Eng(query);
            if (result == null)
                System.out.println(query + "는 저의 사전에 없습니다.");
            else
                System.out.println(query + "은 " + result);
        }

        sc.close();
    }
}
