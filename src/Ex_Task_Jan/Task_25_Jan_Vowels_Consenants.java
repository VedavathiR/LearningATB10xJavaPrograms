package Ex_Task_Jan;

import java.util.Scanner;

public class Task_25_Jan_Vowels_Consenants {
    public static void main(String[] args) {
        int vowel_count=0;
        int consenant_Count=0;
        String name_to_Count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name to count");
        if (sc.hasNextInt())
        {
            System.out.println("Enter OnLy String");
        }
        else {
            name_to_Count = sc.nextLine();
            System.out.println(name_to_Count);
            for (int i = 0; i < name_to_Count.length(); i++) {
                if (name_to_Count.charAt(i) == 'a' || name_to_Count.charAt(i) == 'e' || name_to_Count.charAt(i) == 'i' || name_to_Count.charAt(i) == 'o' || name_to_Count.charAt(i) == 'u' ||
                        name_to_Count.charAt(i) == 'A' || name_to_Count.charAt(i) == 'E' || name_to_Count.charAt(i) == 'I' || name_to_Count.charAt(i) == 'O' || name_to_Count.charAt(i) == 'U') {
                    vowel_count++;
                } else {
                    consenant_Count++;

                }
            }
            System.out.println("Number of Vowels " + vowel_count);
            System.out.println("Number of Consenants" + consenant_Count);
        }
        sc.close();
    }
}
