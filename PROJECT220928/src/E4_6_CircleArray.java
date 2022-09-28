// 예제 4-6

class E4_6_Circle {
    int radius;
    public E4_6_Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class E4_6_CircleArray {
    public static void main(String[] args) {
        E4_6_Circle[] c;
        c = new E4_6_Circle[5];

        for (int i = 0; i < c.length; i++)
            c[i] = new E4_6_Circle(i);

        for (int i = 0; i < c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}