

//package GUI;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JFrame;



public class homePage extends JFrame implements ActionListener{

    public Color SunDevilMaroon = new Color(0x8C1D40);
    public Color SunDevilGold   = new Color(0xFFC627);
    public Color SunDevilSilver = new Color(0x56575E);
    public Color SunDevilBlack  = new Color(0x303234);

    public String printMe = "PRINTED";

    JButton chefButton = new JButton();
    JButton orderProcessingPersonButton = new JButton();
    
    JButton cheeseButton    = new JButton();
    JButton pepperoniButton = new JButton();
    JButton veggieButton    = new JButton();

    JButton mushroomsButton   = new JButton();
    JButton onionsButton      = new JButton();
    JButton olivesButton      = new JButton();
    JButton extracheeseButton = new JButton();

    JButton addToCartButton = new JButton();
    String addToCart       = "ORDER =";
    public String foo_cart = "";

    JLabel menuTitle = new JLabel();

    boolean isCheese    = false;
    boolean isPepperoni = false;
    boolean isVeggie    = false;

    boolean isMusroom     = false;
    boolean isOnions      = false;
    boolean isOlives      = false;
    boolean isExtraCheese = false;
    
    homePage() { //creates frame instance


        //OPP Button
        orderProcessingPersonButton.setBounds(810, 20, 150, 50);
        orderProcessingPersonButton.addActionListener(this);
        orderProcessingPersonButton.setText("Order Processing");


        //Chef Button
        chefButton.setBounds(700, 20, 100, 50);
        chefButton.addActionListener(this);
        chefButton.setText("Chef");
    
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

        addToCartButton.setBounds(300,500, 400, 120);
        addToCartButton.addActionListener(this);
        addToCartButton.setText("Check Out");

        menuTitle.setText("Menu");
        menuTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 40));
        menuTitle.setForeground(Color.WHITE);
        menuTitle.setBounds(30, 9, 100, 100);

        //FRAME LOGIC//
        this.setVisible(true); //makes frame visible
        this.setTitle("PIZZA TIME"); //sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets exit to close app
        this.setResizable(false); //makes HUI ajustable
        this.setSize(1000,700); //setse starting dimentions
        this.setLocationRelativeTo(null); //When opened, opens in center of screen
        
        this.add(cheeseButton);
        this.add(pepperoniButton);
        this.add(veggieButton);
    
        this.add(mushroomsButton);
        this.add(onionsButton);
        this.add(olivesButton);
        this.add(extracheeseButton);

        this.add(addToCartButton);
        this.add(menuTitle);
        
        this.add(chefButton);//chef button tab
        this.add(orderProcessingPersonButton);


        //FRAME ATTRIBUTES//
        this.getContentPane().setBackground(SunDevilSilver); //sets background to maroon
        this.getContentPane().setLayout(null); //sets the layout to be absolute so you dont have to use panels

    }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
        
        
            if(e.getSource() == chefButton){
                System.out.println("Chef Button Pressed");
                chefPage chef = new chefPage();
                this.dispose();
            }
        
            if(e.getSource() == orderProcessingPersonButton){
                System.out.println("OrderProccessPAGE");
                this.dispose();
                orderProcessingPage newProcessingPage = new orderProcessingPage();
                this.dispose();
            }
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

        
            //ADD TO CART Button
            if (e.getSource() == addToCartButton){
               
                //go throught all options to see if theyre in the order

                if(isCheese){
                    addToCart += " Cheese Pizza with ";
                }
                if (isPepperoni){
                    addToCart += " Pepperoni Pizza with ";
                }
                if (isVeggie){
                    addToCart += " Veggie Pizza with ";
                }
                if (isMusroom){
                    addToCart += " Mushrooms, ";
                }
                if (isOnions){
                    addToCart += " Onions, ";
                }
                if (isOlives){
                    addToCart += " Olives, ";
                }
                if (isExtraCheese){
                    addToCart += " Extra Cheese ";
                }
                System.out.println(addToCart); //prints the cart
                foo_cart = addToCart;
                System.out.println("foo cart" + foo_cart);
                addToCart = ""; //clears the order so you dont get it incrimented
                this.dispose();
                cartPage newCart = new cartPage();//OPENES CART Window

        }
    }

        public static void main(String[] args){
            homePage show = new homePage();
        }
}
