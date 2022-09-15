/*
 * 예제 2-2 변수, 리터럴, 상수 활용
 */

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;

        double radius = 10.0;
        double circleArea = radius * radius * PI;

        System.out.println("원의 면적 = " + circleArea);
    }
}
