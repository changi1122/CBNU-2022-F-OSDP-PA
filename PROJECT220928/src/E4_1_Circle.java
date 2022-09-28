// 예제 4-1

public class E4_1_Circle {
    int radius;
    String name;

    public E4_1_Circle() {}

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        E4_1_Circle pizza = new E4_1_Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        E4_1_Circle donut = new E4_1_Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
