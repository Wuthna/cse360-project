
//package GUI;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;

//import 

public class cartPage extends homePage implements ActionListener{

    //instance variables
    static JFrame cartPage = new JFrame();

    JButton checkoutButton = new JButton(new ImageIcon(new ImageIcon(getClass().getResource("checkout.png")).getImage().getScaledInstance(400, 100, Image.SCALE_DEFAULT)));
    JLabel cartTitle = new JLabel();
    JLabel pizzaLabel = new JLabel();
    JLabel toppingsLabel = new JLabel();
    String finalOrder;
    

    public cartPage(String x)
    {
        this.finalOrder = x;
        System.out.println(finalOrder);
        String f[] = finalOrder.split(":");
        System.out.println(f[0]);
        this.dispose();
        System.out.println("CART SUCCESS");

        checkoutButton.addActionListener(this);
        checkoutButton.setOpaque(false);
        checkoutButton.setContentAreaFilled(false);
        checkoutButton.setBorderPainted(false);
        //checkoutButton.setText("Checkout");
        checkoutButton.setBounds(150,250, 400, 100);

        
        cartTitle.setText("Cart");
        cartTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        cartTitle.setForeground(Color.WHITE);
        cartTitle.setBounds(30, 9, 100, 30);

        pizzaLabel.setText("Pizza:         " + f[0].split(" ")[1]);
        pizzaLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        pizzaLabel.setForeground(Color.WHITE);
        pizzaLabel.setBounds(117, 80, 300, 30);

        toppingsLabel.setText("Toppings: "+f[1]);
        toppingsLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        toppingsLabel.setForeground(Color.WHITE);
        toppingsLabel.setBounds(117, 110, 500, 50);

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
    
    cartPage(){
        
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
