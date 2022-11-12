//package GUI;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;

public class waitTimePage extends cartPage implements ActionListener{
	//initializing variables
    static JFrame waitTimePage = new JFrame();
    JLabel acceptedOrderLabel = new JLabel();
    JLabel waitTimeLabel = new JLabel();

    waitTimePage(int estWaitTime) {
    	//declaring variables properties
        acceptedOrderLabel.setText("Your Order Has Been Accepted");
        acceptedOrderLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        acceptedOrderLabel.setForeground(Color.WHITE);
        acceptedOrderLabel.setBounds(30, 9, 500, 50);
         
        waitTimeLabel.setText("Estimated Wait time is " + estWaitTime + " minutes");
        waitTimeLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        waitTimeLabel.setForeground(Color.WHITE);
        waitTimeLabel.setBackground(SunDevilMaroon);
        waitTimeLabel.setOpaque(true);
        waitTimeLabel.setBounds(125, 200, 400, 80);

        //setting the scene and adding content to the JFrame
        waitTimePage.setVisible(true); //makes frame visible
        waitTimePage.setTitle("Checkout"); //sets title
        waitTimePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        waitTimePage.setResizable(false); //makes GUI ajustable
        waitTimePage.setSize(700,400); //setse starting dimentions
        waitTimePage.setLocationRelativeTo(null); //When opened, opens in center of screen
        waitTimePage.getContentPane().setBackground(SunDevilBlack);
        waitTimePage.add(acceptedOrderLabel);
        waitTimePage.add(waitTimeLabel);
        //ensure contents stay in their fixed position 
        waitTimePage.getContentPane().setLayout(null);
    }
}
