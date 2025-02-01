package Ex_Task_Jan;

public class Task_25_Jan_Fizz_Buzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if ( (i%3 == 0) && (i%5 == 0))
            {
                System.out.println("Number " + i + " FizzBuzz");
            }
            else if (i%3 == 0)
            {
                System.out.println("Number " +i + " Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Number "+ i + " Buzz");
            }
        }
    }
}
