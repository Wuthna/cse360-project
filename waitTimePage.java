//package GUI;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

//import 

public class waitTimePage extends cartPage implements ActionListener{

    static JFrame waitTimePage = new JFrame();

    waitTimePage() {


        
        waitTimePage.setVisible(true); //makes frame visible
        waitTimePage.setTitle("Checkout"); //sets title
        waitTimePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        waitTimePage.setResizable(false); //makes GUI ajustable
        waitTimePage.setSize(700,400); //setse starting dimentions
        waitTimePage.setLocationRelativeTo(null); //When opened, opens in center of screen
        waitTimePage.getContentPane().setBackground(SunDevilBlack);
        //waitTimePage.add();

        waitTimePage.getContentPane().setLayout(null);
    }


}