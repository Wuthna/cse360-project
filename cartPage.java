
//package GUI;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

//import 

public class cartPage extends homePage implements ActionListener{

    //instance variables
    static JFrame cartPage = new JFrame();

    JButton checkoutButton = new JButton();

    JLabel cartTitle = new JLabel();
    JLabel pizzaLabel = new JLabel();
    JLabel toppingsLabel = new JLabel();
    
    cartPage(){
        this.dispose();
        System.out.println("CART SUCCESS");



        checkoutButton.addActionListener(this);
        checkoutButton.setText("Checkout");
        checkoutButton.setBounds(150,250, 400, 100);

        
        cartTitle.setText("Cart");
        cartTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        cartTitle.setForeground(Color.WHITE);
        cartTitle.setBounds(30, 9, 100, 30);

        pizzaLabel.setText("Pizza:");
        pizzaLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        pizzaLabel.setForeground(Color.WHITE);
        pizzaLabel.setBounds(117, 80, 100, 30);

        toppingsLabel.setText("Toppings:");
        toppingsLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        toppingsLabel.setForeground(Color.WHITE);
        toppingsLabel.setBounds(70, 110, 200, 50);



        //PAGE BUILDING
        cartPage.setVisible(true); //makes frame visible
        cartPage.setTitle("CART"); //sets title
        cartPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        cartPage.setResizable(false); //makes GUI ajustable
        cartPage.setSize(700,400); //setse starting dimentions
        cartPage.setLocationRelativeTo(null); //When opened, opens in center of screen
        cartPage.getContentPane().setBackground(SunDevilMaroon);
        cartPage.add(cartTitle);
        cartPage.add(pizzaLabel);
        cartPage.add(toppingsLabel);



        cartPage.add(checkoutButton);


        cartPage.getContentPane().setLayout(null); //absolute position
        System.out.println("here ->" + foo_cart);
    }

    @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
        
            if(e.getSource() == checkoutButton){
                
                verifyCheckout newVerify = new verifyCheckout();
                cartPage.dispose();
                this.dispose();
            }
        
        }


}