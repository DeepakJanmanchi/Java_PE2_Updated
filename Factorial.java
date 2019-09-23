import java.io.*;
import java.util.*;
import java.lang.*;

public class Factorial{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
       
        if(n>=1 && n<=12){
           int l = factorial(n);
           System.out.println("The factorial of " +n +" is " +l);

        }
        else if(n>=13 && n<=20){
            long lf = longFactorial(n);
           System.out.println("The factorial of " +n +" is " +lf);
        }

        else{
           System.out.println("The factorial of " +n +" is out of range \n");
        }
       
    }
    
   

        public static int factorial(int n){
          if(n==1){
              return 1;
          }

          return n*factorial(n-1);
          

        }

         public static long longFactorial(int n){
          if(n==1){return 1;}

          return n*longFactorial(n-1);

        }


    }
