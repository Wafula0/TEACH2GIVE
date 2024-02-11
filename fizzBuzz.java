/* write a programthat prints numbers from1 to 100.For multiples of 3 print "Fizz"
* .For multiples of 5 print "Buzz",and for numbers that are multiples of both 3 and 5
* print "FizzBuzz"*/
public class fizzBuzz {
    public static void main(String []args){
        int i;
        for(i=100;i>0;i--){
            if(i%3==0){
                System.out.println(i+"."+"Fizz");
            }  if (i%5==0) {
                System.out.println(i+"."+"Buzz");

            }  if (i%3==0 && i%5==0) {
                System.out.println(i+"."+"FizzBuzz");

            }
        }
    }
    
}
