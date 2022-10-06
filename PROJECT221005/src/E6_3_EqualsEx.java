// 예제 6-3

class E6_3_Point {
    int x, y;
    public E6_3_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        E6_3_Point p = (E6_3_Point)obj;
        if (x == p.x && y == p.y) return true;
        else return false;
    }
}

public class E6_3_EqualsEx {
    public static void main(String[] args) {
        E6_3_Point a = new E6_3_Point(2, 3);
        E6_3_Point b = new E6_3_Point(2, 3);
        E6_3_Point c = new E6_3_Point(3, 4);

        if(a == b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
    }
}
