// 8장 실습문제 6번

import javax.swing.*;
import java.awt.*;

public class P6 extends JFrame {
    public P6() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        Container c = getContentPane();
        c.setLayout(null);

        for(int i = 0; i < 20; i++) {
            JLabel label = new JLabel(" ");
            label.setSize(10, 10);
            label.setOpaque(true);
            label.setBackground(Color.BLUE);

            label.setLocation((int)(Math.random() * 200 + 50), (int)(Math.random() * 200 + 50));
            c.add(label);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        P6 frame = new P6();
    }
}
