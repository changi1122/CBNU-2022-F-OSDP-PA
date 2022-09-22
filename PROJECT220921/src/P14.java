/*
 * 3장 실습문제 14번 : 과목 이름 점수 저장 후 요청에 따라 출력
 */

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int[] score = { 95, 88, 76, 62, 55 };

        Scanner sc = new Scanner(System.in);
        String name;

        while (true) {
            System.out.print("과목 이름>>");
            name = sc.next();
            if (name.equals("그만")) break;

            int i = 0;
            for (; i < course.length; i++) {
                if (name.equals(course[i])) {
                    System.out.println(name + "의 점수는 " + score[i]);
                    break;
                }
            }

            if (i == course.length)
                System.out.println("없는 과목입니다.");
        }

        sc.close();
    }
}
