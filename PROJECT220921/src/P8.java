/*
 * 3장 실습문제 8번 : 정수 배열 생성 후 삽입
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class P8 {
    public static void fillArray(int[] arr, int size)
    {
        int[] input = new int[100];
        for (int i = 0; i < 100; i++)
            input[i] = i + 1;

        // input 배열을 리스트로 변환 후 셔플
        List<Integer> inputList = Arrays.stream(input).boxed().collect(Collectors.toList());
        Collections.shuffle(inputList);
        input = inputList.stream().mapToInt(i -> i).toArray();

        for (int i = 0; i < size; i++) {
            arr[i] = input[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 몇개?");

        int size = sc.nextInt();
        int[] arr = new int[size];

        fillArray(arr, size);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        sc.close();
    }
}
