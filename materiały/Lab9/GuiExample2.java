import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Click Me!");

        btn.setBounds(100, 10, 100, 40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });

        frame.add(btn);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}