package Example;// 예제 6-2

class E6_2_Point {
    int x, y;
    public E6_2_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Example.Point(" + x + "," + y + ")";
    }
}

public class E6_2_ToStringEx {
    public static void main(String[] args) {
        E6_2_Point p = new E6_2_Point(2, 3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p + "입니다.");
    }
}
