import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

public class chefStartCooking extends chefPage implements ActionListener {
    // instance variables
    static JFrame chefStartCooking = new JFrame();
    JButton startCookingButton = new JButton();
    JButton backButton = new JButton();
    JCheckBox pizzaCheckBox = new JCheckBox();
    JLabel chefTitle = new JLabel();
    chefStartCooking() {

        this.dispose();

        chefTitle.setText("Pizza status for order set to COOKING");
        chefTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        chefTitle.setForeground(Color.WHITE);
        chefTitle.setBounds(30, 9, 460, 30);


        startCookingButton.setBounds(300, 200, 200, 80);
        startCookingButton.addActionListener(this);
        startCookingButton.setText("click when pizza is finished");

        pizzaCheckBox.setBounds(150, 150, 420, 50);
        pizzaCheckBox.addActionListener(this);
        pizzaCheckBox.setText("ORDER NUMBER 1 ");
        pizzaCheckBox.setFocusable(false);
        pizzaCheckBox.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 15));

        chefStartCooking.setVisible(true); // makes frame visible
        chefStartCooking.setTitle("Cooking view"); // sets title
        chefStartCooking.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // sets exit to close app
        chefStartCooking.setResizable(false); // makes GUI ajustable
        chefStartCooking.setSize(700, 400); // setse starting dimentions
        chefStartCooking.setLocationRelativeTo(null); // When opened, opens in center of screen
        chefStartCooking.getContentPane().setBackground(SunDevilMaroon);
        chefStartCooking.add(startCookingButton);
        chefStartCooking.add(backButton);
        chefStartCooking.add(chefTitle);
        chefStartCooking.add(pizzaCheckBox);
        chefStartCooking.getContentPane().setLayout(null); // absolute position
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        if (e.getSource() == startCookingButton) {

            chefpizzadone pizzadone = new chefpizzadone();
            chefStartCooking.dispose();
            this.dispose();
        }

    }


}
