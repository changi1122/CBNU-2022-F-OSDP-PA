// 예제 9-1

import javax.swing.*;

public class E9_1_MyFrame extends JFrame {
    public E9_1_MyFrame() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        E9_1_MyFrame frame = new E9_1_MyFrame();
    }
}
