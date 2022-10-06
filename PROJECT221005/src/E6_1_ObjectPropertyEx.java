// 예제 6-1

class E6_1_Point {
    int x, y;
    public E6_1_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class E6_1_ObjectPropertyEx {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }

    public static void main(String[] args) {
        E6_1_Point p = new E6_1_Point(2, 3);
        print(p);
    }
}
