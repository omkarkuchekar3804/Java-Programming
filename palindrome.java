import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==org_num){
            System.out.println(org_num+"the number is palindrome ");
            
        }
        else{
            System.out.println(org_num+"the number is not palindrome");
        }
    }
}