// 예제 4-3

public class E4_3_Circle {
    int radius;
    String name;

    public E4_3_Circle() {
        radius = 1; name = "";
    }

    public E4_3_Circle(int r, String n) {
        radius = r; name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        E4_3_Circle pizza = new E4_3_Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        E4_3_Circle donut = new E4_3_Circle();
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
