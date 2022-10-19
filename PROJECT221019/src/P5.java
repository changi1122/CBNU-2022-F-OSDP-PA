// 8장 실습문제 5번

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class P5 extends JFrame {
    public P5() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 4);
        Container c = getContentPane();
        c.setLayout(grid);
        c.setLayout(grid);

        Color[][] colors = { { Color.red, Color.orange, Color.yellow, Color.green },
                { Color.cyan, Color.blue, Color.magenta, Color.lightGray },
                { Color.pink, Color.lightGray, Color.white, Color.gray },
                { Color.black, Color.orange, Color.blue, Color.magenta }
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel label = new JLabel(Objects.toString(i * 4 + j));
                label.setBackground(colors[i][j]);
                label.setOpaque(true);
                c.add(label);
            }
        }

        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P5();
    }
}
