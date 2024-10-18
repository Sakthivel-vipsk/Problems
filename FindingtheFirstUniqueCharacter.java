package org.JavaArrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindingtheFirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "abcab";
        char result =  find(str);
        if (result != 0) {
            System.out.println("The first unique character is: " + result);
        } else {
            System.out.println("No unique character found.");
        }

    }

    private static char find(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray() ){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}
