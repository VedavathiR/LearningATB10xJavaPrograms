package ex_04_if_For_Switch;

public class Lab0011_Find_Even_Number_bw_1_50 {
    public static void main(String[] args) {
        for (int i=0 ; i<=50 ; i++)
        { if( i % 2 == 0) {
            System.out.println("Number " +  i +" is EVEN" );
        }
        else {
            System.out.println("Number " + i + " is ODD");
        }
        }
    }
}
