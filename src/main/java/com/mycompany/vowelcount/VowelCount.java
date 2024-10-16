/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;

/**
 *
 * @author RC_Student_lab
 */
 import java.util.Scanner;
public class VowelCount {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //we prompt the user to enter the string of their choice
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        //here we display the number of vowels
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }

    public static int countVowels(String sentence) {
        //here we convert the given the string to all lowercase letters
        sentence = sentence.toLowerCase();
        int count = 0;

        //we use a loop to go through the given sentense or string to check for vowels
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            // Check if the character is a vowel
            if ("aeiou".indexOf(currentChar) != -1) {
                count++;
            }
        }
        
        return count;
    }
}




