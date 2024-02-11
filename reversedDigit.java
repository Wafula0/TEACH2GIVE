import java.util.Scanner;

//write a program that takes an integer as input and returns an interger with reversed digit ordering
public class reversedDigit {
    public static void main(String[]args){
        System.out.println("Enter the number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int reverse=0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse * 10+rem;
            num/=10;
        }
        System.out.println(reverse);
    }
}
