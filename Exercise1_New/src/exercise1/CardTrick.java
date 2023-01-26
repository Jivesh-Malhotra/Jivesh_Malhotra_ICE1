package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) 
    {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[((int)(Math.random()*3)+1)]);
            hand[i] = card;
            //System.out.println(hand[i].getSuit() + " " + hand[i].getValue());
            /*
                I am printing out Random cards generated after taking input 
                from the user to make it logical card guessing game because 
                otherwise the user will always guess the right answer.
            */
        }
        int i=0;
        do
        {
            Scanner sc = new Scanner(System.in);
            //input from user 
            System.out.println("Enter the Card Value");
            int cvalue = sc.nextInt();
            System.out.println("Enter the Suit");
            String suit = sc.next();
        
            if(cvalue==hand[i].getValue())
            {
                if(suit==hand[i].getSuit())
                {
                    System.out.println("You Guessed It Right");   
                }
               printInfo();
            }
            else
            {
                System.out.println();
                System.out.println("You Guessed It Wrong. Try Again");   
                System.out.println();
            }
            
        }
        while(!true);
        for(int j=0;j< hand.length;j++)
        {
            System.out.println(hand[j].getSuit() + " " + hand[j].getValue());
        }

    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * I'm Done!
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
