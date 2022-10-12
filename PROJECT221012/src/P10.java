// 7장 실습문제 10번

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        Vector<Shape> shapes = new Vector<>();

        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >>");
            int cmd = sc.nextInt();

            if (cmd == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                int s = sc.nextInt();
                if (s == 1)
                    shapes.add(new Line());
                else if (s == 2)
                    shapes.add(new Rect());
                else
                    shapes.add(new Circle());
            }
            else if (cmd == 2) {
                System.out.print("삭제할 도형의 위치>> ");
                int pos = sc.nextInt();
                if (pos < shapes.size())
                    shapes.remove(pos);
                else
                    System.out.println("삭제할 수 없습니다.");
            }
            else if (cmd == 3) {
                Iterator<Shape> it = shapes.iterator();
                while (it.hasNext()) {
                    it.next().draw();
                }
            }
            else
                break;
        }

    }
}
