// 예제 4-10

class Sample {
    public int a;
    private int b;
    int c;
}

public class E4_10_AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        // aClass.b = 10;
        aClass.c = 10;
    }
}
