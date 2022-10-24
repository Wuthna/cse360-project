import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;
public class chefpizzadone extends chefPage implements ActionListener{
    //instance variables
    static JFrame chefpizzadone = new JFrame();

    

    JLabel chefTitle = new JLabel();
    JLabel pizzaLabel = new JLabel();
    //create a text field
    JTextField pizzaTextField = new JTextField();

    
    chefpizzadone(){
        this.dispose();
        System.out.println("Your pizza is ready!");

        //initialize pizza text field
        pizzaTextField.setBounds(150, 150, 420, 50);
        pizzaTextField.addActionListener(this);
        pizzaTextField.setEditable(false);
        pizzaTextField.setText("Pizza status is set to READY!! Confirmation email has been sent .");
        
        chefpizzadone.setVisible(true); //makes frame visible
        chefpizzadone.setTitle("Pickup"); //sets title
        chefpizzadone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        chefpizzadone.setResizable(false); //makes GUI ajustable
        chefpizzadone.setSize(700,400); //setse starting dimentions
        chefpizzadone.setLocationRelativeTo(null); //When opened, opens in center of screen
        chefpizzadone.getContentPane().setBackground(SunDevilMaroon);
        chefpizzadone.add(chefTitle);
        chefpizzadone.add(pizzaLabel);
        chefpizzadone.add(pizzaTextField);

        chefpizzadone.getContentPane().setLayout(null); //absolute position
    
    }



}
