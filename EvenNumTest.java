import java.io.*;
import java.util.*;
import java.lang.*;

public class EvenNumTest{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean b = isEven(n);
        System.out.print("The number is: ");
        if(b){
            System.out.println("Even");
        }
        else{System.out.println("Not even");}
       
    }
    
   

        public static boolean isEven(int number){
          
          return(number%2==0);

        }

    }
