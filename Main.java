/** 
* ChildHeight.java - calculates child height 
* Author: Elena Mudrakova     
* Module: 5
* 
* Problem Statement: this progran takes user input, does necessary calculations, 
* formats result and prints result in the formatted way
* 
* Algorithm: 
*   take input from user in feets and inches
*   declare vars for user input
*   convert user input to inches
*   declare formulas for calculating child height depending on gender
*   convert child height to feets and inches back from inches
*   create if else stmt depending on child gender and print the result 
*   in formatted way 
*   
*/   

import java.util.Scanner;
 
public class Main
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //Ask for user input
        System.out.println("Enter child gender(male or female)");
        String gender = keyboard.nextLine();
        
        System.out.println("Enter father height in feets and inches, (for ex. 6.5)");
        double fatherH = keyboard.nextDouble();
        
        System.out.println("Enter mother height in feets and inches, (for ex. 6.5)");
        double motherH = keyboard.nextDouble();
        
        
        //Converting user input to inches and int
        int fatherHconv = (int)(fatherH * 12);
        int motherHconv = (int)(motherH * 12);
        
        //Formulas for calculating child height in inches
        int maleChH = ((motherHconv * 13 / 12) + fatherHconv ) / 2;
        int femaleChH = ((fatherHconv * 12 / 13) + motherHconv) / 2;
        
        //Converting child height to feets and inches
        double maleChHconv = (double)maleChH / 12;
        double femaleChHconv = (double)femaleChH / 12;
        
       
        if(gender.equals("male"))
        {
            String fatherHS = String.valueOf(fatherH);
            String motherHS = String.valueOf(motherH);
            String maleChHconvS = String.valueOf(maleChHconv);
            System.out.printf("%-8s", "Father");
            System.out.printf("%8s", "Mother");
            System.out.printf("%10s", "Gender");
            System.out.printf("%20s", "Child Height\n");
            System.out.println("_____________________________________________\n");
            System.out.printf("%-8s",fatherHS.charAt(0) + "\'" + fatherHS.charAt(2) + "\"");
            System.out.printf("%8s", motherHS.charAt(0) + "\'" + motherHS.charAt(2) + "\"");
            System.out.printf("%10s", gender);
            System.out.printf("%20s", maleChHconvS.charAt(0) + "\'" + maleChHconvS.charAt(2) + "\"");
            
                                
        }
        else 
        {
            String fatherHS = String.valueOf(fatherH);
            String motherHS = String.valueOf(motherH);
            String femaleChHconvS = String.valueOf(maleChHconv);
            System.out.printf("%-8s", "Father");
            System.out.printf("%8s", "Mother");
            System.out.printf("%10s", "Gender");
            System.out.printf("%20s", "Child Height\n");
            System.out.println("_____________________________________________\n");
            System.out.printf("%-8s", fatherHS.charAt(0) + "\'" + fatherHS.charAt(2) + "\"");
            System.out.printf("%8s", motherHS.charAt(0) + "\'" + motherHS.charAt(2) + "\"");
            System.out.printf("%10s", gender);
            System.out.printf("%20s", femaleChHconvS.charAt(0) + "\'" + femaleChHconvS.charAt(2) + "\"");
        }
        
        
        
    }
}
