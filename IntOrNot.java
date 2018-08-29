import java.io.*;
import java.util.*;

    public class IntOrNot{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Something....");
        String n=sc.nextLine();
        try{
          if(Integer.parseInt(n)==Integer.valueOf(n))
          {
            System.out.println("The Given Value "+n+" is A Integer");
          }
        }
        catch(Exception e){
        System.out.println("it's Not an Integer value.");
        }
       
       } 
     }  
