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

        System.out.println("Magic Hand: ");
        for (Card card : magicHand) {
            System.out.println(card);
        }
    }
}
