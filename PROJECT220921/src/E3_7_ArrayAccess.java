/*
 * 예제 3-7 : 배열에 입력받은 수 중 제일큰수 찾기
 */

import java.util.Scanner;

public class E3_7_ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];

        int max = 0;
        System.out.println("양수 5개를 입력하세요.");

        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            if (max < intArray[i])
                max = intArray[i];
        }
        System.out.print("가장 큰 수는 " + max + "입니다.");

        scanner.close();
    }
}
