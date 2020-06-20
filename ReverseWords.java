/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Indra
 */
public class ReverseWords {
    
    public static void main(String args[]) {
        
        StringBuilder newString = new StringBuilder("Hello World");
        
        String s = newString.toString();
        
        String[] words = s.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            StringBuilder rev = new StringBuilder(words[i]).reverse();
            System.out.print(rev.toString() + " ");
        }
        
        
        
    }
    
}
