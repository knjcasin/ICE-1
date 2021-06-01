
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sivagama 
 * 
 * @author Kevin Casin
 * Student No.: 991167470
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7]; //Creates an Array called MagicHand
        
        //For loop that creates a card with random values and suits
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setValue(random.nextInt(13)+ 1);
            magicHand[i].setSuit(Card.SUITS[random.nextInt(4)]);
        }
        
        //For loop to display the cards generated from previous loop above
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
        
        //Ask user to enter their card suit
        System.out.println("\nEnter your card suit:");
        System.out.println("[1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs]");
        int userSuit = input.nextInt();
        
        //Ask user to enter their card value
        System.out.println("\nEnter your card value:");
        System.out.println("[11 for Jacks, 12 for Queens, 13 for Kings, 1 for Aces]");
        int userValue = input.nextInt();
        
        //Creates a new object called userHand and sets suit and value using user input
        Card userHand = new Card();
        userHand.setValue(userValue);
        userHand.setSuit(Card.SUITS[userSuit - 1]);
        
        //Display user's card
        System.out.println("\nThe card in your hand is: " + userHand.getSuit() 
                + " " + userHand.getValue());
        
        
        boolean handCheck = false; //global boolean variable that changes based on for loop below
        
        //For loop that checks if random card suit and value is equal to user's card suit and value
        for (int i=0; i<magicHand.length; i++)
        {
            if (magicHand[i].getSuit().equals(userHand.getSuit())){
                    if (magicHand[i].getValue() == userHand.getValue()){
                        handCheck = true;
                        break;
                    } 
            }
        }
        
        //Displays result if user's card suit and value is found in magicHand
        if (handCheck == true){
            System.out.println("\nYour card is in the magic hand.");
        }
        else{
            System.out.println("\nYour card is not in the magic hand.");
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[2]);
        
    }
    
}
