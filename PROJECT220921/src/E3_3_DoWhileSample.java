/*
 * 예제 3-3 : a-z까지 출력
 */

public class E3_3_DoWhileSample {
    public static void main(String[] args) {
        char c = 'a';

        do {
            System.out.print(c);
            c = (char)(c + 1);
        } while (c <= 'z');
    }
}
