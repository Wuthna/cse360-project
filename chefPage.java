import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;

public class chefPage extends homePage implements ActionListener {
    // instance variables
    static JFrame chefPage = new JFrame();
    JButton pizzareadyButton = new JButton();
    JLabel chefTitle = new JLabel();
    JLabel menuTitle = new JLabel("SunDevil Pizza", JLabel.LEFT);
    JLabel pizzaLabel = new JLabel();
    JLabel asuImage4 = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(175, 75, Image.SCALE_DEFAULT)));

    // todo implement a checkbox of orders recieved from the original home menu
    JCheckBox pizzaCheckBox = new JCheckBox();

    chefPage() {
        this.dispose();
        System.out.println("Welcome to Chef view");

        // initialize the checkbox
        pizzaCheckBox.setBounds(50, 130, 600, 50);
        pizzaCheckBox.addActionListener(this);
        pizzaCheckBox.setText("ORDER NUMBER 1");
        pizzaCheckBox.setFocusable(false);
        pizzaCheckBox.setBackground(Color.WHITE);
        pizzaCheckBox.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 12));

        //pizza being prepared button
        pizzareadyButton.addActionListener(this);
        pizzareadyButton.setText("Preparing");
        pizzareadyButton.setBounds(300, 300, 100, 30);
        pizzareadyButton.setBackground(SunDevilGold);
        pizzareadyButton.setForeground(SunDevilBlack);
        pizzareadyButton.setBorder(blackBrdr);

        //asu image line 
        asuImage4.setBounds(0,0, 200, 50);
        asuImage4.setBackground(Color.WHITE);
        asuImage4.setOpaque(true);
        
        //menu title 
        menuTitle.setBounds(200, 0, 500, 50);
        menuTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.BOLD, 40));
        menuTitle.setOpaque(true);
        menuTitle.setBackground(Color.WHITE);
        
//        //pizza status
//        chefTitle.setText("Pizza Status: Preparing");
//        chefTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 25));
//        chefTitle.setBackground(SunDevilBlack);
//        chefTitle.setForeground(Color.WHITE);
//        chefTitle.setOpaque(true);
//        chefTitle.setBorder(blackBrdr);
//        chefTitle.setBounds(50, 100, 600, 30);

        //orders 
        pizzaLabel.setText("Preparing Orders");
        pizzaLabel.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 20));
        pizzaLabel.setForeground(Color.WHITE);
        pizzaLabel.setBackground(SunDevilBlack);
        pizzaLabel.setOpaque(true);
        pizzaLabel.setBorder(blackBrdr);
        pizzaLabel.setBounds(50, 100, 600, 30);

        // PAGE BUILDING
        chefPage.setVisible(true); // makes frame visible
        chefPage.setTitle("Chef View"); // sets title
        chefPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // sets exit to close app
        chefPage.setResizable(false); // makes GUI ajustable
        chefPage.setSize(700, 400); // setse starting dimentions
        chefPage.setLocationRelativeTo(null); // When opened, opens in center of screen
        chefPage.getContentPane().setBackground(SunDevilMaroon);
        //chefPage.add(chefTitle);
        chefPage.add(menuTitle);
        chefPage.add(asuImage4);
        chefPage.add(pizzaLabel);
        chefPage.add(pizzaCheckBox);
        chefPage.add(pizzareadyButton);

        chefPage.getContentPane().setLayout(null); // absolute position
        System.out.println("here ->" + foo_cart);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        if (e.getSource() == pizzareadyButton) {

            chefStartCooking pizzadone = new chefStartCooking();
            chefPage.dispose();
            this.dispose();
        }

    }
}
