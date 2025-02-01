package ex_Task_19thJan;

public class Task_19th_01_Largest {
    public static void main(String[] args) {
        int a= 45;
        int b= 30;
        int c= 100;

        int largest = (a>b)? ((a>c)? a:b) : ((b>c)? b:c);
        System.out.println("Largest Number "+ largest);

    }
}
