import java.io.*;
import java.util.*;
import java.lang.*;

public class Powerof4{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean b = checkPower4(n);
        System.out.print("The number is: ");
        if(b){
            System.out.println("Power of 4");
        }
        else{System.out.println("Not a power of 4");}
       
    }
    
   

        public static boolean checkPower4(int n){
            if(n%4 == 0 && n%16 == 0){
                return true;
            }
            return false;
        }

    }
