package Ex_Task_Jan;

import java.util.Scanner;

public class Task_25_Jan_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to reverse");
        String word = sc.nextLine();
        System.out.println(word);
        String rev="";
         for (int i=word.length()-1 ; i>=0; i--)
         {
            // System.out.println(i);//
            rev= rev+word.charAt(i);
            // System.out.println(rev);
         }
         if ( word .equals(rev))
         {
             System.out.println(" its Pallindrome");
         }
         else
         {
             System.out.println("not pallindrom");
         }


    }
}
