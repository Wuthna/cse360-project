//package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTextField;

//import 

public class verifyCheckout extends cartPage implements ActionListener{

	//initializing variables
    static JFrame verifyCheckout = new JFrame();
    JButton enterButton = new JButton();
    JLabel IDTitle = new JLabel();
    JLabel asuID = new JLabel("ASU ID");
    JLabel reminder = new JLabel("Click textfield to clear contents");
    JTextField studentIDTextBox;
    String order; 
    int EWT = 0;
    double totalAmount = 0;
    
    verifyCheckout(int estWaitTime, double total) {
    	//initializing and declaring variables
    	EWT = estWaitTime;
    	totalAmount = total; 
        studentIDTextBox = new JTextField();
        System.out.println("Verify Checkout");
    
        //declaring pitchfork image properties 
        pitchforkImage.setBounds(30, 30, 150, 300);
        
        //declaring title properties
        IDTitle.setText("Welcome to ID Verify");
        IDTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 25));
        IDTitle.setForeground(SunDevilBlack);
        IDTitle.setBounds(275, 40, 300, 30);
        
        //declaring enter button properties
        enterButton.addActionListener(this);
        enterButton.setText("Enter");
        enterButton.setBackground(SunDevilMaroon);
        enterButton.setForeground(Color.WHITE);
        enterButton.setBounds(350,225,85, 30);
        
        //declaring reminder properties 
        reminder.setForeground(Color.LIGHT_GRAY);
        reminder.setBounds(300, 325, 200, 30);

        //delcaring asu ID properties 
        asuID.setForeground(SunDevilMaroon);
        asuID.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 25));
        asuID.setBounds(250, 135, 100, 30);
        
        //initialize the text box
        studentIDTextBox.setBounds(350, 135, 175, 30);
        studentIDTextBox.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 25));
        studentIDTextBox.setForeground(Color.LIGHT_GRAY);
        studentIDTextBox.setText("Enter ASU ID");
        studentIDTextBox.setCaretColor(SunDevilBlack);
        //add mouse listener to clear the text field when it is 
        studentIDTextBox.addMouseListener(new MouseAdapter()
        		{
        			@Override
        			public void mouseClicked(MouseEvent e)
        			{
        				studentIDTextBox.setText("");
        			}
        		});

        /*setting the scene and adding contents onto verify checkout JFrame */
        verifyCheckout.setVisible(true); //makes frame visible
        verifyCheckout.setTitle("Checkout"); //sets title
        verifyCheckout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        verifyCheckout.setResizable(false); //makes GUI ajustable
        verifyCheckout.setSize(700,400); //setse starting dimentions
        verifyCheckout.setLocationRelativeTo(null); //When opened, opens in center of screen
        verifyCheckout.getContentPane().setBackground(SunDevilGold);
        verifyCheckout.getContentPane().setLayout(null); //absolute positions
        verifyCheckout.add(pitchforkImage);
        verifyCheckout.add(enterButton);
        verifyCheckout.add(IDTitle);
        verifyCheckout.add(asuID);
        verifyCheckout.add(reminder);
        verifyCheckout.add(studentIDTextBox);
    }
    //display the estimated wait time page when the enter button is clicked
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource() == enterButton) {
            System.out.println("HERE" + studentIDTextBox.getText());
            //pass on estimated wait time to ensure it is not lost when a new home page instance is declared 
            waitTimePage newWaitTime = new waitTimePage(EWT);
            verifyCheckout.dispose();
            cartPage.dispose();
            this.dispose();
        }
    }
}
