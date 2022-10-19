// 8장 실습문제 7번

import javax.swing.*;
import java.awt.*;

class TopBar extends JPanel {
    public TopBar() {
        this.setBackground(Color.lightGray);
        this.setLayout(new FlowLayout());

        JLabel resultLabel = new JLabel("수식 입력");
        this.add(resultLabel);
        JTextField resultBox = new JTextField("", 18);
        this.add(resultBox);
    }
}

class InputGrid extends JPanel {
    public InputGrid() {
        GridLayout grid = new GridLayout(4, 4);
        grid.setVgap(4);
        grid.setHgap(4);
        this.setLayout(grid);

        String[][] texts = { { "0", "1", "2", "3" },
                { "4", "5", "6", "7" },
                { "8", "9", "CE", "계산" },
                { "+", "-", "x", "/" }
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton(texts[i][j]);
                if (i == 3) button.setBackground(Color.cyan);
                this.add(button);
            }
        }
    }
}

class ResultBar extends JPanel {
    public ResultBar() {
        this.setBackground(Color.yellow);
        this.setLayout(new FlowLayout());

        JLabel resultLabel = new JLabel("계산 결과");
        this.add(resultLabel);
        JTextField resultBox = new JTextField("", 20);
        this.add(resultBox);
    }
}

public class P7 extends JFrame {
    public P7() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);

        Container c = getContentPane();

        c.setLayout(new BorderLayout(0, 0));
        c.add(new TopBar(), BorderLayout.NORTH);
        c.add(new InputGrid(), BorderLayout.CENTER);
        c.add(new ResultBar(), BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new P7();
    }
}
