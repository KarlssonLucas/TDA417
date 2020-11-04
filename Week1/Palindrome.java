import java.util.*;
import java.io.*;

class Palindrome {
    public static void main(String[] args) {
        new Palindrome().program();
    }

    public void program() {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abb"));
        System.out.println(isPalindrome("Aba"));
        System.out.println(isPalindrome("a.cca"));
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        s = convert(s);
        for (int i = s.length(); i>0; i--) {
            sb.append(s.charAt(i-1));
        }
        return s.equals(sb.toString());
    }

    public String convert(String s) {
        String converted = "";
        for(int i = 0; i<s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))) {
                converted += s.charAt(i);
            }
        }
        return converted;
    } 
}
