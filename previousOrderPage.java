

//package GUI;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JFrame;



public class previousOrderPage extends orderProcessingPage implements ActionListener{

    static JFrame previousOrderPage = new JFrame();


    JLabel orderName = new JLabel();
    JLabel orderID = new JLabel();
    JLabel orderItself = new JLabel();
    JLabel orderDate = new JLabel();
    JLabel orderStatus = new JLabel();

    previousOrderPage(){
        orderProcessingPage.dispose();
        this.dispose();

        orderName.setText("Name:");
        orderName.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        orderName.setForeground(Color.WHITE);
        orderName.setBounds(50, 10, 100, 30);

        orderID.setText("ID:");
        orderID.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        orderID.setForeground(Color.WHITE);
        orderID.setBounds(400, 10, 100, 30);

        orderItself.setText("Order:");
        orderItself.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        orderItself.setForeground(Color.WHITE);
        orderItself.setBounds(300, 100, 100, 50);

        orderDate.setText("Date:");
        orderDate.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        orderDate.setForeground(Color.WHITE);
        orderDate.setBounds(50, 200, 100, 30);

        orderStatus.setText("Status:");
        orderStatus.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 30));
        orderStatus.setForeground(Color.WHITE);
        orderStatus.setBounds(300, 280, 100, 50);

        previousOrderPage.add(orderDate);
        //
        previousOrderPage.add(orderStatus);
        //
        previousOrderPage.add(orderID);
        //
        previousOrderPage.add(orderItself);

        previousOrderPage.add(orderName);
        //
        

        previousOrderPage.setVisible(true); //makes frame visible
        previousOrderPage.setTitle("Previous Order"); //sets title
        previousOrderPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        previousOrderPage.setResizable(false); //makes GUI ajustable
        previousOrderPage.setSize(700,400); //setse starting dimentions
        previousOrderPage.setLocationRelativeTo(null); //When opened, opens in center of screen
        //previousOrderPage.setLayout(new java.awt.FlowLayout());
        previousOrderPage.getContentPane().setBackground(SunDevilBlack);
        previousOrderPage.getContentPane().setLayout(null);
    }









}