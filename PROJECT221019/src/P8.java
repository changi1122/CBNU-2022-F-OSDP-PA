// 8장 실습문제 8번

import javax.swing.*;
import java.awt.*;

class MenuBar extends JPanel {
    public MenuBar() {
        this.setBackground(Color.lightGray);
        this.setLayout(new FlowLayout());

        this.add(new JButton("열기"));
        this.add(new JButton("닫기"));
        this.add(new JButton("나가기"));
    }
}

class Display extends JPanel {
    public Display() {
        this.setBackground(Color.white);
        this.setLayout(null);

        for(int i = 0; i < 20; i++) {
            JLabel label = new JLabel("*");
            label.setSize(10, 10);
            label.setForeground(Color.red);

            label.setLocation((int)(Math.random() * 200 + 50), (int)(Math.random() * 200 + 50));
            this.add(label);
        }
    }
}

class WordInputBar extends JPanel {
    public WordInputBar() {
        this.setBackground(Color.yellow);
        this.setLayout(new FlowLayout());

        this.add(new JButton("Word input"));
        JTextField resultBox = new JTextField("", 16);
        this.add(resultBox);
    }
}

public class P8 extends JFrame {
    public P8() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);

        Container c = getContentPane();

        c.setLayout(new BorderLayout(0, 0));
        c.add(new MenuBar(), BorderLayout.NORTH);
        c.add(new Display(), BorderLayout.CENTER);
        c.add(new WordInputBar(), BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new P8();
    }
}
