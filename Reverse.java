import java.io.*;
import java.util.*;

public class Reverse{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String reversed = reverseString(s);
        System.out.println("Reversed string is: "+ reversed);
        if(checkPalindrome(reversed,s)){
            System.out.println("Palindrome");
        }
        else{System.out.println("Not a palindrome");}
       
    }
    
    public static String reverseString(String s){
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--){
        
           s1 = s1 + s. charAt(i); 
           
           }

           return s1;

        }

        public static boolean checkPalindrome(String reversed, String s){
            if(s.equals(reversed)){
                return true;
            }
            return false;
        }

    }
