// 8장 실습문제 1번

import javax.swing.*;

public class P1 extends JFrame {
    public P1() {
        setTitle("Let's study Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        P1 frame = new P1();
    }
}
