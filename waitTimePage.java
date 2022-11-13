//package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;

public class waitTimePage extends cartPage implements ActionListener{
	//initializing variables
    static JFrame waitTimePage = new JFrame();
    JLabel acceptedOrderLabel = new JLabel();
    JLabel waitTimeLabel = new JLabel();
    JLabel titleLabel = new JLabel("Wait Time Page");
    JLabel asuImage3 = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(175, 75, Image.SCALE_DEFAULT)));

    waitTimePage(int estWaitTime) {
    	//title properties
    	asuImage3.setBounds(0, 0, 175, 75);
    	asuImage3.setBackground(Color.WHITE);
    	asuImage3.setOpaque(true);
    	
    	titleLabel.setBounds(175, 0, 525, 75);
    	titleLabel.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.BOLD, 40));
    	titleLabel.setBackground(Color.white);
    	titleLabel.setForeground(SunDevilBlack);
    	titleLabel.setOpaque(true);
    	
    	//declaring variables properties
        acceptedOrderLabel.setText("Your order has been accepted");
        acceptedOrderLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        acceptedOrderLabel.setBounds(125, 150, 350, 30);
         
        waitTimeLabel.setText("Estimated wait time is " + estWaitTime + " minutes");
        waitTimeLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        waitTimeLabel.setForeground(Color.WHITE);
        waitTimeLabel.setBackground(SunDevilMaroon);
        waitTimeLabel.setBorder(blackBrdr);
        waitTimeLabel.setOpaque(true);
        waitTimeLabel.setBounds(125, 200, 350, 30);

        //setting the scene and adding content to the JFrame
        waitTimePage.setVisible(true); //makes frame visible
        waitTimePage.setTitle("Checkout"); //sets title
        waitTimePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        waitTimePage.setResizable(false); //makes GUI ajustable
        waitTimePage.setSize(700,400); //setse starting dimentions
        waitTimePage.setLocationRelativeTo(null); //When opened, opens in center of screen
        waitTimePage.getContentPane().setBackground(SunDevilGold);
        waitTimePage.add(acceptedOrderLabel);
        waitTimePage.add(waitTimeLabel);
        waitTimePage.add(titleLabel);
        waitTimePage.add(asuImage3);
        //ensure contents stay in their fixed position 
        waitTimePage.getContentPane().setLayout(null);
    }
}
