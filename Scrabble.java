package Metlink;

import java.util.HashMap;
import java.util.Map;


import java.util.Scanner;

public class Scrabble {

    public static void main(String[] args) {
    	   
        scan();
     }
     
     public static void scan() {
      	
     	// this asks in console for the user to enter a word
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your scrabble word and I will total your points: ");
         String scrabWord = scanner.nextLine();
         int score = scoreCalculator(scrabWord);
         System.out.println("The Scrabble score of the word \"" + scrabWord + "\" is " + score);
         System.out.print("Do you have another word to total (Y/N)? ");
         String answer = scanner.nextLine().toUpperCase();
         if (answer.equals("Y")) {
         	scan();
         }
         scanner.close(); // Close scanner after all input is collected
     }

    public static int scoreCalculator(String scrabWord) {
        Map<Character, Integer> numberScore = new HashMap<>();
        // this method sets every letter to the number value of the scrabble game.
        numberScore.put('A', 1);
        numberScore.put('B', 3);
        numberScore.put('C', 3);
        numberScore.put('D', 2);
        numberScore.put('E', 1);
        numberScore.put('F', 4);
        numberScore.put('G', 2);
        numberScore.put('H', 4);
        numberScore.put('I', 1);
        numberScore.put('J', 8);
        numberScore.put('K', 5);
        numberScore.put('L', 1);
        numberScore.put('M', 3);
        numberScore.put('N', 1);
        numberScore.put('O', 1);
        numberScore.put('P', 3);
        numberScore.put('Q', 10);
        numberScore.put('R', 1);
        numberScore.put('S', 1);
        numberScore.put('T', 1);
        numberScore.put('U', 1);
        numberScore.put('V', 4);
        numberScore.put('W', 4);
        numberScore.put('X', 8);
        numberScore.put('Y', 4);
        numberScore.put('Z', 10);
        
        

        int score = 0;
        for (char c : scrabWord.toUpperCase().toCharArray()) {
            if (numberScore.containsKey(c)) {
                score += numberScore.get(c);
            }
        }
        return score;
        
    }
}