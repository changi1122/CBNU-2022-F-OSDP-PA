// 예제 6-9

import java.util.StringTokenizer;

public class E6_9_StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
