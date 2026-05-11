import java.util.*;
public class substringVowel {
    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static void main(String[] args){
        String s = "artyebui";
        int k = 2 ;
        int left = 0, maxLen = -1 ;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(isVowel(ch)){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            // shrink window
            while(map.size() > k){
                char leftChar = s.charAt(left);
                if(isVowel(leftChar)){
                    map.put(leftChar, map.get(leftChar) - 1);
                    if(map.get(leftChar) == 0){
                        map.remove(leftChar);
                    }
                }
                left++;
            }
            // valid case
            if(map.size() == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println(maxLen);
    }
}