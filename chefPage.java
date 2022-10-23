import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

public class chefPage extends homePage implements ActionListener {
    // instance variables
    static JFrame chefPage = new JFrame();

    JButton pizzareadyButton = new JButton();

    JLabel chefTitle = new JLabel();
    JLabel pizzaLabel = new JLabel();

    // todo implement a checkbox of orders recieved from the original home menu
    JCheckBox pizzaCheckBox = new JCheckBox();

    chefPage() {
        this.dispose();
        System.out.println("Welcome to Chef view");

        // initialize the checkbox
        pizzaCheckBox.setBounds(150, 150, 420, 50);
        pizzaCheckBox.addActionListener(this);
        pizzaCheckBox.setText("ORDER NUMBER 1 COOKING");
        pizzaCheckBox.setFocusable(false);
        pizzaCheckBox.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 15));

        pizzareadyButton.addActionListener(this);
        pizzareadyButton.setText("pizzaready");
        pizzareadyButton.setBounds(460, 300, 100, 30);

        chefTitle.setText("Chef View");
        chefTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        chefTitle.setForeground(Color.WHITE);
        chefTitle.setBounds(30, 9, 250, 30);

        pizzaLabel.setText("Set Pizza to Ready:");
        pizzaLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        pizzaLabel.setForeground(Color.WHITE);
        pizzaLabel.setBounds(30, 80, 300, 30);

        // PAGE BUILDING
        chefPage.setVisible(true); // makes frame visible
        chefPage.setTitle("CART"); // sets title
        chefPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // sets exit to close app
        chefPage.setResizable(false); // makes GUI ajustable
        chefPage.setSize(700, 400); // setse starting dimentions
        chefPage.setLocationRelativeTo(null); // When opened, opens in center of screen
        chefPage.getContentPane().setBackground(SunDevilMaroon);
        chefPage.add(chefTitle);
        chefPage.add(pizzaLabel);
        chefPage.add(pizzaCheckBox);
        chefPage.add(pizzareadyButton);

        chefPage.getContentPane().setLayout(null); // absolute position
        System.out.println("here ->" + foo_cart);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        if (e.getSource() == pizzareadyButton) {

            chefpizzadone pizzadone = new chefpizzadone();
            chefPage.dispose();
            this.dispose();
        }

    }
}
