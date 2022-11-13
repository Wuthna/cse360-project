
//package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;

//import 

public class cartPage extends homePage implements ActionListener{

    //instance variables
    static JFrame cartPage = new JFrame();

    //initializing variables
    JButton checkoutButton = new JButton();
    JLabel cartTitle = new JLabel();
    JLabel pizzaLabel = new JLabel();
    JLabel toppingsLabel = new JLabel();
    JLabel orderLabel = new JLabel("Order");
    JLabel asuImage2 = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(175, 75, Image.SCALE_DEFAULT)));
    JLabel totalLabel = new JLabel();
    String finalOrder;
    int EWT = 0; 
    double totalAmount = 0; 

    public cartPage(String x, int estWaitTime, double total)
    {
    	//declaring variables
        this.finalOrder = x;
        EWT = estWaitTime;
        totalAmount = total; 
        
        //display order contents
        System.out.println(finalOrder);
        String f[] = finalOrder.split(":");
        System.out.println(f[0]);
        this.dispose();
        System.out.println("CART SUCCESS");
        
        //declaring checkout button properties
        checkoutButton.addActionListener(this);
        checkoutButton.setText("Order Now");
        checkoutButton.setBackground(SunDevilGold);
        checkoutButton.setBorder(blackBrdr);
        checkoutButton.setBounds(150,250, 400, 50);

        //pitchfork image 
        asuImage2.setBounds(0, 0, 175, 75);
        asuImage2.setBackground(Color.white);
        asuImage2.setOpaque(true);
        
        //declaring title properties
        cartTitle.setText("Cart");
        cartTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.BOLD, 40));
        cartTitle.setBackground(Color.white);
        cartTitle.setOpaque(true);
        cartTitle.setBounds(175, 0, 525, 75);
        
        //declaring order label properties 
        orderLabel.setFont(text);
        orderLabel.setBackground(SunDevilBlack);
        orderLabel.setForeground(Color.white);
        orderLabel.setOpaque(true);
        orderLabel.setBounds(117, 110, 450, 25);
        
        //declaring pizza label properties
        pizzaLabel.setText("Pizza:         " + f[0].split(" ")[1]);
        pizzaLabel.setFont(text);
        pizzaLabel.setBackground(Color.WHITE);
        pizzaLabel.setBorder(lightGrayBrdr);
        pizzaLabel.setOpaque(true);
        pizzaLabel.setBounds(117, 135, 450, 25);

        //declaring topping label properties
        toppingsLabel.setText("Toppings: "+f[1]);
        toppingsLabel.setFont(text);
        toppingsLabel.setBackground(Color.WHITE);
        toppingsLabel.setBorder(lightGrayBrdr);
        toppingsLabel.setOpaque(true);
        toppingsLabel.setBounds(117, 160, 450, 25);
        
        //declaring total label properties
        totalLabel.setText("Total:          $"+ df.format(totalAmount));
        totalLabel.setFont(text);
        totalLabel.setBackground(Color.WHITE);
        totalLabel.setBorder(lightGrayBrdr);
        totalLabel.setOpaque(true);
        totalLabel.setBounds(117, 185, 450, 25);

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
        cartPage.add(totalLabel);
        cartPage.add(checkoutButton);
        cartPage.add(orderLabel);
        cartPage.add(asuImage2);


        cartPage.getContentPane().setLayout(null); //absolute position
        System.out.println("here ->" + foo_cart);
    }
    //empty constructor
    cartPage(){
        
    }
    //proceed to the verify checkout page when the checkout button is clicked
    @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
        
            if(e.getSource() == checkoutButton){
                //carry over estimated wait time
                verifyCheckout newVerify = new verifyCheckout(EWT, totalAmount);
                cartPage.dispose();
                this.dispose();
            }  
        }
}
