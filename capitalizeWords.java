import java.util.Scanner;
//Write a program that takes String as input and capitalizes first letter of each word and returns the results
public class capitalizeWords {
    public static void main(String[]args){
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String word= scanner.nextLine();
        System.out.println(word);
        System.out.println(word.substring(0,1).toUpperCase()+word.substring(1));
    }
}
