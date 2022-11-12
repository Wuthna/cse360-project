

//package GUI;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.text.html.ImageView;
import javax.swing.*;

public class homePage extends JFrame implements ActionListener{
	//initializing used colors
    public Color SunDevilMaroon = new Color(0x8C1D40);
    public Color SunDevilGold   = new Color(0xFFC627);
    public Color SunDevilSilver = new Color(0x56575E);
    public Color SunDevilBlack  = new Color(0x303234);
    
    //retrieving images and put them in a JLabel 
    JLabel pepperoniImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("pepperoni.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
    JLabel cheeseImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("cheese.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel veggieImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("veggie.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel mushroomImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("mushrooms.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel oliveImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("olives.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel onionImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("onion.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel extraCheeseImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("xtraCheese.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT))); 
    JLabel chefImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("chef.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
    JLabel orderProcessingImage = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("orderProcessing.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
    
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

    //menu title 
    JLabel menuTitle = new JLabel();

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
    
    homePage() { //creates frame instance
        //OPP Button
    	orderProcessingImage.setBounds(825, 400, 100, 100);
        orderProcessingPersonButton.setBounds(800, 525, 150, 50);
        orderProcessingPersonButton.addActionListener(this);
        orderProcessingPersonButton.setText("Order Processing");

        //Chef Button
        chefImage.setBounds(40, 425, 100, 100);
        chefButton.setBounds(45, 525, 100, 50);
        chefButton.addActionListener(this);
        chefButton.setText("Chef");
    
     //PIZZA CHOICES
        //Cheese Pizza Button
        cheeseImage.setBounds(125, 75, 100, 100); 
        cheeseButton.setBounds(50,175,250,25);
        cheeseButton.addActionListener(this); 
        cheeseButton.setText("CHEESE");


        //Pepperoni Pizza Button
        pepperoniImage.setBounds(450, 75, 100, 100);
        pepperoniButton.setBounds(375,175,250, 25);
        pepperoniButton.addActionListener(this); 
        pepperoniButton.setText("PEPPERONI");

        //Veggie Pizza Button
        veggieImage.setBounds(775, 75, 100, 100);
        veggieButton.setBounds(700,175,250,25);
        veggieButton.addActionListener(this); 
        veggieButton.setText("VEGGIE");

     //TOPPINGS
        //Mushrooms
        mushroomImage.setBounds(365, 200, 100, 100);
        mushroomsButton.setBounds(333,300,150,25);
        mushroomsButton.addActionListener(this); 
        mushroomsButton.setText("MUSHROOM");
    
        //Onions
        onionImage.setBounds(545, 200, 100, 100);
        onionsButton.setBounds(517,300,150,25);
        onionsButton.addActionListener(this); 
        onionsButton.setText("ONION");

        //Olives
        oliveImage.setBounds(365, 320, 100, 100);
        olivesButton.setBounds(333,420,150,25);
        olivesButton.addActionListener(this); 
        olivesButton.setText("OLIVES");

        //Extra Cheese
        extraCheeseImage.setBounds(545, 320, 100, 100);
        extracheeseButton.setBounds(517,420,150,25);
        extracheeseButton.addActionListener(this); 
        extracheeseButton.setText("EXTRA CHEESE");

        //add to cart button
        addToCartButton.setBounds(250, 500, 500, 100);
        addToCartButton.setText("Checkout");
        addToCartButton.addActionListener(this);

        //setting text and properties for menu title
        menuTitle.setText("Menu");
        menuTitle.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 40));
        menuTitle.setForeground(Color.WHITE);
        menuTitle.setBounds(450, 0, 100, 100);

        //FRAME LOGIC//
        this.setVisible(true); //makes frame visible
        this.setTitle("PIZZA TIME"); //sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets exit to close app
        this.setResizable(false); //makes HUI ajustable
        this.setSize(1000,700); //setse starting dimentions
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
        
        //adding the chef and order processing buttons and images
        this.add(chefImage);
        this.add(chefButton);//chef button tab
        this.add(orderProcessingPersonButton);
        this.add(orderProcessingImage);

        //FRAME ATTRIBUTES//
        this.getContentPane().setBackground(SunDevilSilver); //sets background to maroon
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
                System.out.println("Is now cheese");
            } else if (e.getSource() == cheeseButton && isCheese == true ){
                isCheese = false;
                estWaitTime -= 3;
                System.out.println("Is now not cheese");
            }
            //PEPPERONI Pizza Button ACTIONS
            if (e.getSource() == pepperoniButton && isPepperoni == false && !isCheese && !isVeggie){//makes sure only one of the Pizzas can be selected at a time
                isPepperoni = true;
                estWaitTime += 5;
                System.out.println("Is now pepperoni");
            } else if (e.getSource() == pepperoniButton && isPepperoni == true){
                isPepperoni = false;
                estWaitTime -= 5;
                System.out.println("Is now not pepperoni");
            }
            //VEGGIE Pizza Button ACTIONS
             if (e.getSource() == veggieButton && isVeggie == false && !isCheese && !isPepperoni){//makes sure only one of the Pizzas can be selected at a time
                isVeggie = true;
                estWaitTime += 7;
                System.out.println("Is now veggie");
            } else if (e.getSource() == veggieButton && isVeggie == true){
            	estWaitTime -= 7;
                isVeggie = false;
                System.out.println("Is now not veggie");
            }

        //Pizza Topping Actions
            //Mushrooms
            if (e.getSource() == mushroomsButton && isMusroom == false){
                isMusroom = true;
                estWaitTime++;
                System.out.println("Mushrooms has been added");
            } else if (e.getSource() == mushroomsButton && isMusroom == true){
                isMusroom = false;
                estWaitTime--;
                System.out.println("Mushrooms has been removed");
            }
            //Onions
            if (e.getSource() == onionsButton && isOnions == false){
                isOnions = true;
                estWaitTime++;
                System.out.println("Onions has been added");
            } else if (e.getSource() == onionsButton && isOnions == true){
                isOnions = false;
                estWaitTime--;
                System.out.println("Onions has been removed");
            }

            //Olives
            if (e.getSource() == olivesButton && isOlives == false){
                isOlives = true;
                estWaitTime++;
                System.out.println("Olives has been added");
            } else if (e.getSource() == olivesButton && isOlives == true){
                isOlives = false;
                estWaitTime--;
                System.out.println("Olives has been removed");
            }

            //ExtraCheese
            if (e.getSource() == extracheeseButton && isExtraCheese == false){
                isExtraCheese = true;
                estWaitTime++;
                System.out.println("Extra Cheese has been added");
            } else if (e.getSource() == extracheeseButton && isExtraCheese == true){
                isExtraCheese = false;
                estWaitTime--;
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
                cartPage newCart = new cartPage(addToCart, estWaitTime);//OPENES CART Window and carries over the necessary information
        }
    }
        public static void main(String[] args){
            homePage show = new homePage();
        }
}
