// 8장 실습문제 3번

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class P3 extends JFrame {
    public P3() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);
        Container c = getContentPane();
        c.setLayout(grid);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(Objects.toString(i));
            c.add(button);
        }

        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P3();
    }
}
