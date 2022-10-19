// 8장 실습문제 Open Challenge

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        this.setBackground(Color.lightGray);
        this.setLayout(new FlowLayout());

        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}

class CenterPanel extends JPanel {
    public CenterPanel() {
        this.setLayout(null);

        JLabel hello = new JLabel("Hello");
        hello.setSize(60, 20);
        hello.setLocation(50, 70);
        this.add(hello);
        JLabel love = new JLabel("Love");
        love.setSize(60, 20);
        love.setLocation(160, 20);
        this.add(love);
        JLabel java = new JLabel("Java");
        java.setSize(60, 20);
        java.setLocation(110, 150);
        this.add(java);
    }
}

public class OpenChallenge extends JFrame {
    public OpenChallenge() {
        setTitle("Open Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);

        Container c = getContentPane();

        c.setLayout(new BorderLayout(0, 0));
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new OpenChallenge();
    }
}
