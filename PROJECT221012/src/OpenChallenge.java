// 7장 Open Challenge

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class Word {
    String eng;
    String kor;
    public Word(String eng, String kor) {
        this.eng = eng; this.kor = kor;
    }
}

public class OpenChallenge {
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


        System.out.println("명품 영어의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");

        int wordSize = v.size();
        while (true) {
            Vector<Integer> problem = new Vector<Integer>();
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
            int select = sc.nextInt();
            if (select == -1) break;

            if (v.get(problem.get(select - 1)).kor.equals(answer))
                System.out.println("Excellent !!");
            else
                System.out.println("No. !!");
        }
    }
}
