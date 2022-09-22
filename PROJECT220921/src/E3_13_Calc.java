/*
 * 예제 3-13 : main()에서 명령행 인자의 합 계산
 */

public class E3_13_Calc {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 0; i < args.length; i++)
            sum += Double.parseDouble(args[i]);

        System.out.println("합계 :" + sum);
    }
}
