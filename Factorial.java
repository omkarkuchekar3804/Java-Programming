import java.util.*;
public class Factorial{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();

        int factorial=1;

        for(int i=1; i<=num; i++){
            factorial=i*factorial;
        }
        System.out.println("The factorial of the number is "+factorial);
    }
}