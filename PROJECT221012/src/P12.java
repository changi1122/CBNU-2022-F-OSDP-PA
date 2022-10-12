// 7장 실습문제 12번

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class P12 {

    static void test(Vector<Word> v, Scanner sc) {
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");

        int wordSize = v.size();
        while (true) {
            Vector<Integer> problem = new Vector<>();
            while (problem.size() < 4) {
                int candidate = (int)(Math.random() * wordSize);
                int i = 0;
                for (; i < problem.size(); i++) {
                    if (problem.get(i) == candidate) {
                        break;
                    }
                }
                if (i == problem.size())
                    problem.add(candidate);
            }

            String answer = v.get(problem.get(0)).kor;
            System.out.println(v.get(problem.get(0)).eng + "?");
            Collections.shuffle(problem);
            for (int i = 0; i < 4; i++) {
                System.out.print("(" + (i + 1) + ")" + v.get(problem.get(i)).kor + " ");
            }
            System.out.print("  :>");
            int select;
            try {
                select = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요 !!");
                continue;
            }
            if (select == -1) break;

            if (v.get(problem.get(select - 1)).kor.equals(answer))
                System.out.println("Excellent !!");
            else
                System.out.println("No. !!");
        }
    }

    static void addWord(Vector<Word> v, Scanner sc)
    {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while (true) {
            System.out.print("영어 한글 입력>>");
            String line = sc.nextLine();
            if (line.equals("그만")) break;

            String[] props = line.split(" ");
            v.add(new Word(props[0], props[1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Word> v = new Vector<>();
        v.add(new Word("love", "사랑"));
        v.add(new Word("peace", "평화"));
        v.add(new Word("apple", "사과"));
        v.add(new Word("dream", "꿈"));
        v.add(new Word("choice", "선택"));
        v.add(new Word("master", "주인"));
        v.add(new Word("candy", "사탕"));
        v.add(new Word("mouse", "쥐"));
        v.add(new Word("monkey", "원숭이"));
        v.add(new Word("banana", "바나나"));
        v.add(new Word("hope", "희망"));


        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\"입니다.");
        while (true) {
            System.out.print("단어테스트:1, 단어삽입:2, 종료:3 >>");
            int cmd = sc.nextInt();

            if (cmd == 3) break;
            if (cmd == 1)
                test(v, sc);
            else if (cmd == 2)
                addWord(v, sc);
        }
    }
}
