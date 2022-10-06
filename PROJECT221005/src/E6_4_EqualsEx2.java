// 예제 6-4

class E6_4_Rect {
    int width;
    int height;

    public E6_4_Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        E6_4_Rect r = (E6_4_Rect)obj;
        return (width * height == r.width * r.height);
    }
}

public class E6_4_EqualsEx2 {
    public static void main(String[] args) {
        E6_4_Rect a = new E6_4_Rect(2, 3);
        E6_4_Rect b = new E6_4_Rect(3, 2);
        E6_4_Rect c = new E6_4_Rect(3, 4);

        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }
}
