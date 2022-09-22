/*
 * 예제 3-14 : 0으로 나누기 예외 발생으로 프로그램이 강제 종료되는 경우
 */

import java.util.Scanner;

public class E3_14_DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.print("나뉨수를 입력하시오:");
        dividend = scanner.nextInt();
        System.out.print("나눗수를 입력하시오:");
        divisor = scanner.nextInt();
        System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
        scanner.close();
    }
}
