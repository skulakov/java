/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrings;

import mytestclass.*;

/**
 *
 * @author user
 */
public class JavaString3 {

    public static void main(String[] args) {
        String word = new String("java");
        
        String text1 = "The origins of the name \"Java\" are not clear. One possibility is that the island was named after ";

        
        
        String[] words2 = text1.split("\\W+");
        
        
        System.out.format("Слов в тексте  =  %d%n", words2.length);

        
        for(String w: words2){
            System.out.printf(w + "; ");
        }
        System.out.println("\n-------------");
        
         System.out.printf("Используем CompareTo(%s,%s)", word, words2[0], word.equalsIgnoreCase(words2[0]));
         
          System.out.println("\n-------------");
        
         System.out.printf("Используем CompareTo(%s,%s)", word, words2[0], word.compareTo(words2[0]));
        
    }
}
