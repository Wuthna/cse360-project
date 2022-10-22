

//package GUI;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;



public class homePage extends JFrame implements ActionListener{

    Color SunDevilMaroon = new Color(0x8C1D40);
    Color SunDevilGold   = new Color(0xFFC627);
    Color SunDevilSilver = new Color(0x56575E);
    Color SunDevilBlack  = new Color(0x303234);

    JButton cheeseButton    = new JButton();
    JButton pepperoniButton = new JButton();
    JButton veggieButton    = new JButton();

    JButton mushroomsButton   = new JButton();
    JButton onionsButton      = new JButton();
    JButton olivesButton      = new JButton();
    JButton extracheeseButton = new JButton();

    JButton checkoutButton = new JButton();
    String customerOrder   = "ORDER =";

    boolean isCheese    = false;
    boolean isPepperoni = false;
    boolean isVeggie    = false;

    boolean isMusroom     = false;
    boolean isOnions      = false;
    boolean isOlives      = false;
    boolean isExtraCheese = false;
    
    homePage() { //creates frame instance

    // PIZZA CHOICES
        //Cheese Pizza Button
        cheeseButton.setBounds(50,100,250,100);
        cheeseButton.addActionListener(this); 
        cheeseButton.setText("CHEESE");


        //Pepperoni Pizza Button
        pepperoniButton.setBounds(375,100,250,100);
        pepperoniButton.addActionListener(this); 
        pepperoniButton.setText("PEPPERONI");

        //Veggie Pizza Button
        veggieButton.setBounds(700,100,250,100);
        veggieButton.addActionListener(this); 
        veggieButton.setText("VEGGIE");

    //TOPPINGS
        //Mushrooms
        mushroomsButton.setBounds(333,250,150,100);
        mushroomsButton.addActionListener(this); 
        mushroomsButton.setText("Mushroom");
    
        //Onions
        onionsButton.setBounds(517,250,150,100);
        onionsButton.addActionListener(this); 
        onionsButton.setText("Onion");

        //Olives
        olivesButton.setBounds(333,360,150,100);
        olivesButton.addActionListener(this); 
        olivesButton.setText("Olive");

        //Extra Cheese
        extracheeseButton.setBounds(517,360,150,100);
        extracheeseButton.addActionListener(this); 
        extracheeseButton.setText("EXTRA CHEESE");

        checkoutButton.setBounds(300,500, 400, 120);
        checkoutButton.addActionListener(this);
        checkoutButton.setText("Check Out");

        //FRAME LOGIC//
        this.setVisible(true); //makes frame visible
        this.setTitle("PIZZA TIME"); //sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets exit to close app
        this.setResizable(true); //makes HUI ajustable
        this.setSize(1000,700); //setse starting dimentions
        this.setLocationRelativeTo(null); //When opened, opens in center of screen
        this.add(cheeseButton);
        this.add(pepperoniButton);
        this.add(veggieButton);
    
        this.add(mushroomsButton);
        this.add(onionsButton);
        this.add(olivesButton);
        this.add(extracheeseButton);

        this.add(checkoutButton);
        
        //FRAME ATTRIBUTES//
        this.getContentPane().setBackground(SunDevilSilver); //sets background to maroon
        this.getContentPane().setLayout(null); //sets the layout to be absolute so you dont have to use panels

    }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
        //Pizza Type Actions
            //CHEESE Pizza Button ACTIONS
            if (e.getSource() == cheeseButton && isCheese == false && !isPepperoni && !isVeggie){  //makes sure only one of the Pizzas can be selected at a time
                isCheese = true;
                System.out.println("Is now cheese");
            } else if (e.getSource() == cheeseButton && isCheese == true ){
                isCheese = false;
                System.out.println("Is now not cheese");
            }
            //PEPPERONI Pizza Button ACTIONS
            if (e.getSource() == pepperoniButton && isPepperoni == false && !isCheese && !isVeggie){//makes sure only one of the Pizzas can be selected at a time
                isPepperoni = true;
                System.out.println("Is now pepperoni");
            } else if (e.getSource() == pepperoniButton && isPepperoni == true){
                isPepperoni = false;
                System.out.println("Is now not pepperoni");
            }
            //VEGGIE Pizza Button ACTIONS
             if (e.getSource() == veggieButton && isVeggie == false && !isCheese && !isPepperoni){//makes sure only one of the Pizzas can be selected at a time
                isVeggie = true;
                System.out.println("Is now veggie");
            } else if (e.getSource() == veggieButton && isVeggie == true){
                isVeggie = false;
                System.out.println("Is now not veggie");
            }

        //Pizza Topping Actions
            //Mushrooms
            if (e.getSource() == mushroomsButton && isMusroom == false){
                isMusroom = true;
                System.out.println("Mushrooms has been added");
            } else if (e.getSource() == mushroomsButton && isMusroom == true){
                isMusroom = false;
                System.out.println("Mushrooms has been removed");
            }
            //Onions
            if (e.getSource() == onionsButton && isOnions == false){
                isOnions = true;
                System.out.println("Onions has been added");
            } else if (e.getSource() == onionsButton && isOnions == true){
                isOnions = false;
                System.out.println("Onions has been removed");
            }

            //Olives
            if (e.getSource() == olivesButton && isOlives == false){
                isOlives = true;
                System.out.println("Olives has been added");
            } else if (e.getSource() == olivesButton && isOlives == true){
                isOlives = false;
                System.out.println("Olives has been removed");
            }

            //ExtraCheese
            if (e.getSource() == extracheeseButton && isExtraCheese == false){
                isExtraCheese = true;
                System.out.println("Extra Cheese has been added");
            } else if (e.getSource() == extracheeseButton && isExtraCheese == true){
                isExtraCheese = false;
                System.out.println("Extra Cheese has been removed");
            }

        
            //Checkout Button
            if (e.getSource() == checkoutButton){
               

                //go throught all options to see if theyre in the order

                if(isCheese){
                    customerOrder += " Cheese Pizza with ";
                }
                if (isPepperoni){
                    customerOrder += " Pepperoni Pizza with ";
                }
                if (isVeggie){
                    customerOrder += " Veggie Pizza with ";
                }
                if (isMusroom){
                    customerOrder += " Mushrooms, ";
                }
                if (isOnions){
                    customerOrder += " Onions, ";
                }
                if (isOlives){
                    customerOrder += " Olives, ";
                }
                if (isExtraCheese){
                    customerOrder += " Extra Cheese ";
                }
                System.out.println(customerOrder);

        }
    }

        public static void main(String[] args){
            homePage show = new homePage();
        }
}
