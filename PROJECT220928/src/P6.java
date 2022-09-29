// 4장 실습문제 6번

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x; this.y = y; this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle(x, y, radius);
        }

        int maxIndex = 0;
        for (int i = 1; i < 3; i++)
            if (c[maxIndex].getArea() < c[i].getArea())
                maxIndex = i;

        System.out.print("가장 면적이 큰 원은 ");
        c[maxIndex].show();

        sc.close();
    }
}
