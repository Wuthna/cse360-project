//package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

import javax.swing.border.Border;
import javax.swing.text.html.ImageView;

import javafx.scene.effect.Reflection;
import javafx.scene.text.Text;

import javax.swing.*;

public class homePage extends JFrame implements ActionListener{
	//initializing used colors
    public Color SunDevilMaroon = new Color(0x8C1D40);
    public Color SunDevilGold   = new Color(0xFFC627);
    public Color SunDevilSilver = new Color(0x56575E);
    public Color SunDevilBlack  = new Color(0x303234);
    
    //border color and font 
    Border blackBrdr = BorderFactory.createLineBorder(Color.BLACK);
    Border lightGrayBrdr = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
    Font text = new Font(Font.SANS_SERIF, java.awt.Font.PLAIN, 15);
    DecimalFormat df = new DecimalFormat("0.00");
    
    //retrieving images and put them in a JLabel 
    JLabel pepperoniImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("pepperoni.png")).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT)));
    JLabel cheeseImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("cheese.png")).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT))); 
    JLabel veggieImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("veggie.png")).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT))); 
    JLabel mushroomImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("mushrooms.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel oliveImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("olives.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel onionImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("onion.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel extraCheeseImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("xtraCheese.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel chefImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("chef.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
    JLabel orderProcessingImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("orderProcessing.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
    JLabel asuImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT)));
    JLabel pitchforkImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("pitchfork.png")).getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT)));
    
    //declaring buttons
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
    
    //strings used to carry the contents of the pizza
    String addToCart       = "";
    public String foo_cart = "";

    //menu title and other labels
    JLabel menuTitle = new JLabel("SunDevil Pizza", JLabel.LEFT);
    JLabel cheesePrice = new JLabel("Starting at $14.69", JLabel.CENTER);
    JLabel pepperoniPrice = new JLabel("Starting at $16.94", JLabel.CENTER);
    JLabel veggiePrice = new JLabel("Starting at $20.49", JLabel.CENTER);
    JLabel mushroomPrice = new JLabel("Plus $2.00", JLabel.CENTER);
    JLabel onionPrice = new JLabel("Plus $2.00", JLabel.CENTER);
    JLabel olivePrice = new JLabel("Plus $2.00", JLabel.CENTER);
    JLabel extraCheesePrice = new JLabel("Plus $2.25", JLabel.CENTER);
    JLabel toppingTitle = new JLabel("TOPPINGS", JLabel.CENTER);

    //button logic
    boolean isCheese    = false;
    boolean isPepperoni = false;
    boolean isVeggie    = false;
    boolean isMusroom     = false;
    boolean isOnions      = false;
    boolean isOlives      = false;
    boolean isExtraCheese = false;
    
    //estimated wait time is based on the pizza chosen and the number of toppings
    int estWaitTime = 0;
    double total = 0;
    
    homePage() { //creates frame instance
        //OPP Button
    	orderProcessingImage.setBounds(825, 700, 100, 100);
        orderProcessingPersonButton.setBounds(800, 825, 150, 50);
        orderProcessingPersonButton.addActionListener(this);
        orderProcessingPersonButton.setBorder(blackBrdr);
        orderProcessingPersonButton.setFont(text);
        orderProcessingPersonButton.setText("Order Processing");

        //Chef Button
        chefImage.setBounds(40, 700, 100, 100);
        chefButton.setBounds(45, 825, 100, 50);
        chefButton.addActionListener(this);
        chefButton.setBorder(blackBrdr);
        chefButton.setFont(text);
        chefButton.setText("Chef");
    
     //PIZZA CHOICES
        //Cheese Pizza Button
        cheeseImage.setBounds(50, 150, 300, 225); 
        cheeseImage.setOpaque(true);
        cheeseImage.setBorder(blackBrdr);
        cheeseImage.setBackground(Color.WHITE);
        
        cheeseButton.setBounds(50,375,300,25);
        cheeseButton.addActionListener(this); 
        cheeseButton.setOpaque(true);
        cheeseButton.setBackground(SunDevilGold);
        cheeseButton.setBorder(blackBrdr);
        cheeseButton.setFont(text);
        cheeseButton.setText("Cheese");
        

        //Pepperoni Pizza Button
        pepperoniImage.setBounds(350, 150, 300, 225);
        pepperoniImage.setOpaque(true);
        pepperoniImage.setBorder(blackBrdr);
        pepperoniImage.setBackground(Color.WHITE);
        
        pepperoniButton.setBounds(350,375,300, 25);
        pepperoniButton.addActionListener(this);
        pepperoniButton.setOpaque(true);
        pepperoniButton.setBackground(SunDevilGold);
        pepperoniButton.setBorder(blackBrdr);
        pepperoniButton.setFont(text);
        pepperoniButton.setText("Pepperoni");

        //Veggie Pizza Button
        veggieImage.setBounds(650, 150, 300, 225);
        veggieImage.setOpaque(true);
        veggieImage.setBorder(blackBrdr);
        veggieImage.setBackground(Color.WHITE);
        
        veggieButton.setBounds(650,375,300,25);
        veggieButton.addActionListener(this);
        veggieButton.setOpaque(true);
        veggieButton.setBackground(SunDevilGold);
        veggieButton.setBorder(blackBrdr);
        veggieButton.setFont(text);
        veggieButton.setText("Veggie");

     //TOPPINGS
        //Mushrooms
        mushroomImage.setBounds(100, 500, 200, 100);
        mushroomImage.setOpaque(true);
        mushroomImage.setBorder(blackBrdr);
        mushroomImage.setBackground(Color.WHITE);
        
        mushroomsButton.setBounds(100,600,200,25);
        mushroomsButton.addActionListener(this); 
        mushroomsButton.setOpaque(true);
        mushroomsButton.setBackground(SunDevilGold);
        mushroomsButton.setBorder(blackBrdr);
        mushroomsButton.setFont(text);
        mushroomsButton.setText("Mushroom");
    
        //Onions
        onionImage.setBounds(300, 500, 200, 100);
        onionImage.setOpaque(true);
        onionImage.setBorder(blackBrdr);
        onionImage.setBackground(Color.WHITE);
        
        onionsButton.setBounds(300,600,200,25);
        onionsButton.addActionListener(this); 
        onionsButton.setOpaque(true);
        onionsButton.setBackground(SunDevilGold);
        onionsButton.setBorder(blackBrdr);
        onionsButton.setFont(text);
        onionsButton.setText("Onion");

        //Olives
        oliveImage.setBounds(500, 500, 200, 100);
        oliveImage.setOpaque(true);
        oliveImage.setBorder(blackBrdr);
        oliveImage.setBackground(Color.WHITE);
        
        olivesButton.setBounds(500,600,200,25);
        olivesButton.addActionListener(this); 
        olivesButton.setOpaque(true);
        olivesButton.setBackground(SunDevilGold);
        olivesButton.setBorder(blackBrdr);

        olivesButton.setFont(text);
        olivesButton.setText("Olives");

        //Extra Cheese
        extraCheeseImage.setBounds(700, 500, 200, 100);
        extraCheeseImage.setOpaque(true);
        extraCheeseImage.setBorder(blackBrdr);
        extraCheeseImage.setBackground(Color.WHITE);
        
        extracheeseButton.setBounds(700,600,200,25);
        extracheeseButton.addActionListener(this); 
        extracheeseButton.setOpaque(true);
        extracheeseButton.setBackground(SunDevilGold);
        extracheeseButton.setBorder(blackBrdr);
        extracheeseButton.setFont(text);
        extracheeseButton.setText("Extra cheese");

        //add to cart button
        addToCartButton.setBounds(300, 800, 400, 50);
        addToCartButton.setText("Checkout");
        addToCartButton.setBackground(SunDevilGold);
        addToCartButton.setBorder(blackBrdr);
        addToCartButton.setFont(text);
        addToCartButton.addActionListener(this);

        //setting properties for menu title
        asuImage.setBackground(Color.white);
        asuImage.setOpaque(true);
        asuImage.setBounds(0,0,200,100);
        
        menuTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.BOLD, 40));
        menuTitle.setBackground(Color.white);
        menuTitle.setOpaque(true);
        menuTitle.setBounds(200, 0, 1000, 100);
        
     //setting properties for pizza and topping prices
        //pizza prices
        cheesePrice.setForeground(Color.WHITE);
        cheesePrice.setBackground(SunDevilBlack);
        cheesePrice.setOpaque(true);
        cheesePrice.setBorder(blackBrdr);
        cheesePrice.setFont(text);
        cheesePrice.setBounds(50, 125, 300, 25);
        
        pepperoniPrice.setForeground(Color.WHITE);
        pepperoniPrice.setBackground(SunDevilBlack);
        pepperoniPrice.setOpaque(true);;
        pepperoniPrice.setBorder(blackBrdr);
        pepperoniPrice.setFont(text);
        pepperoniPrice.setBounds(350, 125, 300, 25);
        
        veggiePrice.setForeground(Color.WHITE);
        veggiePrice.setBackground(SunDevilBlack);
        veggiePrice.setOpaque(true);
        veggiePrice.setBorder(blackBrdr);
        veggiePrice.setFont(text);
        veggiePrice.setBounds(650, 125, 300, 25);
        
        //topping prices
        mushroomPrice.setForeground(Color.WHITE);
        mushroomPrice.setBackground(SunDevilBlack);
        mushroomPrice.setOpaque(true);
        mushroomPrice.setBorder(blackBrdr);
        mushroomPrice.setFont(text);
        mushroomPrice.setBounds(100, 475, 200, 25);
        
        onionPrice.setForeground(Color.WHITE);
        onionPrice.setBackground(SunDevilBlack);
        onionPrice.setOpaque(true);
        onionPrice.setBorder(blackBrdr);
        onionPrice.setFont(text);
        onionPrice.setBounds(300, 475, 200, 25);
        
        olivePrice.setForeground(Color.WHITE);
        olivePrice.setBackground(SunDevilBlack);
        olivePrice.setOpaque(true);
        olivePrice.setBorder(blackBrdr);
        olivePrice.setFont(text);
        olivePrice.setBounds(500, 475, 200, 25);
        
        extraCheesePrice.setForeground(Color.WHITE);
        extraCheesePrice.setBackground(SunDevilBlack);
        extraCheesePrice.setOpaque(true);
        extraCheesePrice.setBorder(blackBrdr);
        extraCheesePrice.setFont(text);
        extraCheesePrice.setBounds(700, 475, 200, 25);

        //FRAME LOGIC//
        this.setVisible(true); //makes frame visible
        this.setTitle("PIZZA TIME"); //sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets exit to close app
        this.setResizable(false); //makes HUI ajustable
        this.setSize(1000,1000); //setse starting dimentions
        this.setLocationRelativeTo(null); //When opened, opens in center of screen
        
        //adding the pizza buttons and images to the frame
        this.add(cheeseImage);
        this.add(cheeseButton);
        this.add(pepperoniImage);
        this.add(pepperoniButton);
        this.add(veggieButton);
        this.add(veggieImage);
    
        //adding the topping buttons and images to the frame
        this.add(mushroomImage);
        this.add(mushroomsButton);
        this.add(onionImage);
        this.add(onionsButton);
        this.add(oliveImage);
        this.add(olivesButton);
        this.add(extraCheeseImage);
        this.add(extracheeseButton);

        //adding the add to cart and menu title
        this.add(addToCartButton);
        this.add(menuTitle);
        this.add(asuImage);
        
        //add the prices
        this.add(cheesePrice);
        this.add(pepperoniPrice);
        this.add(veggiePrice);
        this.add(mushroomPrice);
        this.add(onionPrice);
        this.add(olivePrice);
        this.add(extraCheesePrice);
        
        //adding the chef and order processing buttons and images
        this.add(chefImage);
        this.add(chefButton);//chef button tab
        this.add(orderProcessingPersonButton);
        this.add(orderProcessingImage);

        //FRAME ATTRIBUTES//
        this.getContentPane().setBackground(SunDevilMaroon); //sets background to maroon
        this.getContentPane().setLayout(null); //sets the layout to be absolute so you dont have to use panels
    }

    	//When buttons are clicked, this method performs tasks such as incrementing the estimated wait time, changing boolean values, 
    	//and letting the user know their pizza type and toppings. 
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
                estWaitTime += 3;
                total += 14.69;
                System.out.println("Is now cheese");
            } else if (e.getSource() == cheeseButton && isCheese == true ){
                isCheese = false;
                estWaitTime -= 3;
                total -= 14.69;
                System.out.println("Is now not cheese");
            }
            //PEPPERONI Pizza Button ACTIONS
            if (e.getSource() == pepperoniButton && isPepperoni == false && !isCheese && !isVeggie){//makes sure only one of the Pizzas can be selected at a time
                isPepperoni = true;
                estWaitTime += 5;
                total += 16.94;
                System.out.println("Is now pepperoni");
            } else if (e.getSource() == pepperoniButton && isPepperoni == true){
                isPepperoni = false;
                estWaitTime -= 5;
                total -= 16.94;
                System.out.println("Is now not pepperoni");
            }
            //VEGGIE Pizza Button ACTIONS
             if (e.getSource() == veggieButton && isVeggie == false && !isCheese && !isPepperoni){//makes sure only one of the Pizzas can be selected at a time
                isVeggie = true;
                estWaitTime += 7;
                total += 20.49;
                System.out.println("Is now veggie");
            } else if (e.getSource() == veggieButton && isVeggie == true){
            	estWaitTime -= 7;
            	total -= 30.49;
                isVeggie = false;
                System.out.println("Is now not veggie");
            }

        //Pizza Topping Actions
            //Mushrooms
            if (e.getSource() == mushroomsButton && isMusroom == false){
                isMusroom = true;
                estWaitTime++;
                total += 2.00;
                System.out.println("Mushrooms has been added");
            } else if (e.getSource() == mushroomsButton && isMusroom == true){
                isMusroom = false;
                estWaitTime--;
                total -= 2.00;
                System.out.println("Mushrooms has been removed");
            }
            //Onions
            if (e.getSource() == onionsButton && isOnions == false){
                isOnions = true;
                estWaitTime++;
                total += 2.00;
                System.out.println("Onions has been added");
            } else if (e.getSource() == onionsButton && isOnions == true){
                isOnions = false;
                estWaitTime--;
                total -= 2.00;
                System.out.println("Onions has been removed");
            }

            //Olives
            if (e.getSource() == olivesButton && isOlives == false){
                isOlives = true;
                estWaitTime++;
                total += 2.00;
                System.out.println("Olives has been added");
            } else if (e.getSource() == olivesButton && isOlives == true){
                isOlives = false;
                estWaitTime--;
                total -= 2.00;
                System.out.println("Olives has been removed");
            }

            //ExtraCheese
            if (e.getSource() == extracheeseButton && isExtraCheese == false){
                isExtraCheese = true;
                estWaitTime++;
                total += 2.25;
                System.out.println("Extra Cheese has been added");
            } else if (e.getSource() == extracheeseButton && isExtraCheese == true){
                isExtraCheese = false;
                estWaitTime--;
                total -= 2.25;
                System.out.println("Extra Cheese has been removed");
            }

        
            //ADD TO CART Button
            if (e.getSource() == addToCartButton){
               
                //go through all options to see if they are in the order

                if(isCheese){
                    addToCart += " Cheese Pizza with: ";
                }
                if (isPepperoni){
                    addToCart += " Pepperoni Pizza with: ";
                }
                if (isVeggie){
                    addToCart += " Veggie Pizza with: ";
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
                //addToCart = ""; //clears the order so you don't get it incremented
                this.dispose();
                cartPage newCart = new cartPage(addToCart, estWaitTime, total);//OPENES CART Window and carries over the necessary information
        }
    }
        public static void main(String[] args){
            homePage show = new homePage();
        }
}
