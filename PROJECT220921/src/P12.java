/*
 * 3장 실습문제 12번 : 명령행 인자 정수 합
 */

public class P12 {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                int n = Integer.parseInt(arg);
                sum += n;
            }
            catch (NumberFormatException e) {
                continue;
            }
        }

        System.out.println(sum);
    }
}
