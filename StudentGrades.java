import java.io.*;
import java.util.*;
import java.lang.*;

public class StudentGrades{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int grade[] = new int[n];
        int sum = 0;
       for(int i=0; i<n; i++){
           int s = i+1;
           System.out.print("Enter the grade of student" +s + ":");
           grade[i]=sc.nextInt();
           sum += grade[i];
       }
       System.out.println("Aggregate grades of students is: "+ sum/n);
       Arrays.sort(grade);
       System.out.println("Minimum grade of students is: "+ grade[0]);
       System.out.println("Maximum grade of students is: "+ grade[n-1]);

    }
    
   

        public static boolean isEven(int number){
          
          return(number%2==0);

        }

    }
