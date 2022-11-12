//package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTextField;

//import 

public class verifyCheckout extends cartPage implements ActionListener{

	//initializing variables
    static JFrame verifyCheckout = new JFrame();
    JButton enterButton = new JButton();
    JLabel asuIDTitle = new JLabel();
    JTextField studentIDTextBox;
    String order; 
    int EWT = 0;
    
    verifyCheckout(int estWaitTime) {
    	//initializing and declaring variables
    	EWT = estWaitTime;
        studentIDTextBox = new JTextField();
        System.out.println("Verify Checkout");
    
        //declaring enter button properties
        enterButton.addActionListener(this);
        enterButton.setText("Enter");
        enterButton.setBounds(150,250, 400, 100);

        //declaring ASU ID title properties
        asuIDTitle.setText("Enter ASU ID");
        asuIDTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        asuIDTitle.setForeground(SunDevilBlack);
        asuIDTitle.setBounds(30, 9, 300, 30);

        //initialize the text box
        studentIDTextBox.setBounds(30, 50, 300, 30);
        studentIDTextBox.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        studentIDTextBox.setForeground(SunDevilBlack);
        studentIDTextBox.setCaretColor(SunDevilBlack);
        //studentIDTextBox.setForeground(SunDevilSilver);
        //studentIDTextBox.setText("ASU ID");
        //studentIDTextBox.setBackground(SunDevilMaroon);

        /*setting the scene and adding contents onto verify checkout JFrame */
        verifyCheckout.setVisible(true); //makes frame visible
        verifyCheckout.setTitle("Checkout"); //sets title
        verifyCheckout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        verifyCheckout.setResizable(false); //makes GUI ajustable
        verifyCheckout.setSize(700,400); //setse starting dimentions
        verifyCheckout.setLocationRelativeTo(null); //When opened, opens in center of screen
        verifyCheckout.getContentPane().setBackground(SunDevilGold);
        verifyCheckout.getContentPane().setLayout(null); //absolute positions
        verifyCheckout.add(enterButton);
        verifyCheckout.add(asuIDTitle);
        verifyCheckout.add(studentIDTextBox);
    }
    //display the estimated wait time page when the enter button is clicked
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    
        if(e.getSource() == enterButton) {
            System.out.println("HERE" + studentIDTextBox.getText());
            //pass on estimated wait time to ensure it is not lost when a new home page instance is declared 
            waitTimePage newWaitTime = new waitTimePage(this.EWT);
            verifyCheckout.dispose();
            cartPage.dispose();
            this.dispose();
        }
    }
}
