import javax.swing.*;

public class GuiExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Click Me!");

        btn.setBounds(100, 10, 100, 40);

        frame.add(btn);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}