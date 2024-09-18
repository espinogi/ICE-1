/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giancarlo_espinosa_ice1;

/**
 * Student Number: 991677453
 * @author Giancarlo Espinosa
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();
        
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Generates a random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Generates a random suit from the SUITS array
            magicHand[i] = c;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a card value (1-13): ");
        int userValue = scan.nextInt();
        System.out.println("Pick a card suit (Diamonds, Spades, Clubs, Hearts): ");
        String userSuit = scan.next();

        Card = luckyCard = new Card(4, "Diamonds"); // lucky card 
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        boolean found = false;
        for (Card card : magicHand) {
            if(card.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        if(found) {
            System.out.println("Your card was in the magic hand! You win!");
            
        } else {
            System.out.println("Your card was not in the magic hand! You lose.");
        }
        scan.close();
    }
}
