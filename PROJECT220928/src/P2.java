// 4장 실습문제 2번

import java.util.Scanner;

class Grade {
    private int math, science, english;

    public Grade(int s1, int s2, int s3) {
        this.math = s1;
        this.science = s2;
        this.english = s3;
    }

    public double average() {
        return (double)(math + science + english) / 3;
    }
}

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        sc.close();
    }
}
