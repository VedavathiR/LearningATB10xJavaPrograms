package ex_03_Operators;

public class Lab009_Nested_Ternary {
    public static void main(String[] args) {
        int n1=30 ;
        int n2=40 ;
        int n3=80;
        int max = (n1>n2) ? ((n1>n3) ? n1:n3):((n2>n3) ? n2:n3);
        System.out.println("Largest Number " + max);


    }
}
