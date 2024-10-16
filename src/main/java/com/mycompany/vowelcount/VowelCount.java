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
        
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }

    public static int countVowels(String sentence) {
       
     
        int count = 0;

        
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            //here we check if the characters that make up the string are vowels
            if ("aeiou".indexOf(currentChar) != -1) {
                count++;
            }
        }
        
        return count;
    }
}


