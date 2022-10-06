// 예제 6-6

public class E6_6_AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n;
        System.out.println("intObject = " + intObject);

        int m = intObject + 10;
        System.out.println("m = " + m);
    }
}
