package org.JavaArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class findRepetitiveCharacters {
    public static void main(String[] args) {
       String input= "Programm@ingp@";
        input= input.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(char c: input.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        System.out.println("Count of Characters :");
        System.out.println(map);
        System.out.println("Repetative Characters :");
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println( entry.getKey() + " appears  : "+ entry.getValue() + " times");
            }
        }

    }
}
