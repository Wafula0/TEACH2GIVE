import java.util.Scanner;
//write a program that takes an interger as input and returns true if interger is a power of two
public class powerOfTwo {
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num>0&&((num&(num-1))==0)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
