import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;

public class chefStartCooking extends chefPage implements ActionListener {
    // instance variables
    static JFrame chefStartCooking = new JFrame();
    JButton startCookingButton = new JButton();
    JButton backButton = new JButton();
    JCheckBox pizzaCheckBox = new JCheckBox();
    JLabel chefTitle = new JLabel();
    JLabel asuImage5 = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(175, 75, Image.SCALE_DEFAULT)));
    JLabel menuTitle = new JLabel("SunDevil Pizza", JLabel.LEFT);
    
    chefStartCooking() {

        this.dispose();
        //title image and text
        asuImage5.setBounds(0,0,200,50);
        asuImage5.setBackground(Color.WHITE);
        asuImage5.setOpaque(true);
        menuTitle.setBounds(200,0,500,50);
        menuTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.BOLD, 40));
        menuTitle.setBackground(Color.WHITE);
        menuTitle.setOpaque(true);
        
        //chef title
        chefTitle.setText("Finished Orders");
        chefTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 20));
        chefTitle.setForeground(Color.WHITE);
        chefTitle.setBackground(SunDevilBlack);
        chefTitle.setBorder(blackBrdr);
        chefTitle.setOpaque(true);
        chefTitle.setBounds(50, 100, 600, 30);

        //pizza finished button
        startCookingButton.setBounds(300, 300, 100, 30);
        startCookingButton.addActionListener(this);
        startCookingButton.setText("Finished");
        startCookingButton.setBackground(SunDevilGold);
        startCookingButton.setForeground(SunDevilBlack);
        startCookingButton.setBorder(blackBrdr);

        //order list
        pizzaCheckBox.setBounds(50, 130, 600, 50);
        pizzaCheckBox.addActionListener(this);
        pizzaCheckBox.setText("ORDER NUMBER 1 ");
        pizzaCheckBox.setFocusable(false);
        pizzaCheckBox.setBackground(Color.WHITE);
        pizzaCheckBox.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 12));

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
        chefStartCooking.add(menuTitle);
        chefStartCooking.add(asuImage5);
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
