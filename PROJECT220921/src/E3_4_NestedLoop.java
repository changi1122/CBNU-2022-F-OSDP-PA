/*
 * 예제 3-4 : 2중 중첩을 이용한 구구단
 */

public class E3_4_NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
