// 예제 10-2

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E10_2_InnerClassListener extends JFrame {
    public E10_2_InnerClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(350, 150);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");
            E10_2_InnerClassListener.this.setTitle(b.getText());
        }
    }

    public static void main(String [] args) {
        new E10_2_InnerClassListener();
    }
}