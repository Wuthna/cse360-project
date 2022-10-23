import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class StudentID {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("hi");

    void NewWindow(){
        label.setText("Hello World");
        label.setBounds(20,20,100,50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
