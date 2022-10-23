//package GUI;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

//import 

public class verifyCheckout extends cartPage implements ActionListener{

    static JFrame verifyCheckout = new JFrame();

    JButton enterButton = new JButton();
    JLabel asuIDTitle = new JLabel();

    verifyCheckout() {
    this.dispose();
        System.out.println("Verify Checkout");
    


        enterButton.addActionListener(this);
        enterButton.setText("Enter");
        enterButton.setBounds(150,250, 400, 100);

        asuIDTitle.setText("Enter ASU ID");
        asuIDTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        asuIDTitle.setForeground(Color.WHITE);
        asuIDTitle.setBounds(30, 9, 100, 30);


        verifyCheckout.setVisible(true); //makes frame visible
        verifyCheckout.setTitle("Checkout"); //sets title
        verifyCheckout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        verifyCheckout.setResizable(false); //makes GUI ajustable
        verifyCheckout.setSize(700,400); //setse starting dimentions
        verifyCheckout.setLocationRelativeTo(null); //When opened, opens in center of screen
        verifyCheckout.getContentPane().setBackground(SunDevilGold);
        verifyCheckout.add(enterButton);

        verifyCheckout.getContentPane().setLayout(null);
        
    }


    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    
        if(e.getSource() == enterButton) {
            
            waitTimePage newWaitTime = new waitTimePage();
            verifyCheckout.dispose();
            cartPage.dispose();
            this.dispose();
        }
    
    }





}