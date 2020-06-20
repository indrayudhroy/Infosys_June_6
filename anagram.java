/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Indra
 */
public class anagram {
    
    public static void main(String args[]) {
        
        String s1 = new StringBuilder("abcde").toString();
        String s2 = new StringBuilder("dcab").toString();
        
        char[] firstString = s1.toCharArray();
        char[] secondString = s2.toCharArray();
        
        List<Character> list1 = new ArrayList<Character>();
        List<Character> list2 = new ArrayList<Character>();
        
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        
        for (char ch : firstString) {
            list1.add(ch);
            if (map1.containsKey(ch))
                map1.put(ch, map1.get(ch)+1);
            else
                map1.put(ch, 1);
        }
        for (char ch : secondString) {
            list2.add(ch);
            if (map2.containsKey(ch))
                map2.put(ch, map2.get(ch)+1);
            else
                map2.put(ch, 1);
        }
        
        int matching = 0;
        
        for (char key : map1.keySet()) {
            
            int count = map1.get(key);
            if (map1.get(key) == map2.get(key)) {
                matching++;
            }
            
        }
        
        if (matching == list1.size()) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        } 
            
        
        
        
        
        
        
        
    }
    
}
