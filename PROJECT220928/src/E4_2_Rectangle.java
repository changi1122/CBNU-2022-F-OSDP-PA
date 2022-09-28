// 예제 4-2

import java.util.Scanner;

public class E4_2_Rectangle {
    int width;
    int height;

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        E4_2_Rectangle rect = new E4_2_Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");

        rect.width = sc.nextInt();
        rect.height = sc.nextInt();

        System.out.println("사각형의 면적은 " + rect.getArea());

        sc.close();
    }
}
