// 8장 실습문제 4번

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class P4 extends JFrame {
    public P4() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);
        Container c = getContentPane();
        c.setLayout(grid);
        c.setLayout(grid);

        JButton button = new JButton("0");
        button.setBackground(Color.RED);
        c.add(button);
        button = new JButton("1");
        button.setBackground(Color.ORANGE);
        c.add(button);
        button = new JButton("2");
        button.setBackground(Color.YELLOW);
        c.add(button);
        button = new JButton("3");
        button.setBackground(Color.GREEN);
        c.add(button);
        button = new JButton("4");
        button.setBackground(Color.CYAN);
        c.add(button);
        button = new JButton("5");
        button.setBackground(Color.BLUE);
        c.add(button);
        button = new JButton("6");
        button.setBackground(Color.MAGENTA);
        c.add(button);
        button = new JButton("7");
        button.setBackground(Color.GRAY);
        c.add(button);
        button = new JButton("8");
        button.setBackground(Color.PINK);
        c.add(button);
        button = new JButton("9");
        button.setBackground(Color.LIGHT_GRAY);
        c.add(button);

        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P4();
    }
}
