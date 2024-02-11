import java.util.Scanner;
//Q2.write to generate fibonacci sequence up to 100
public class FibonacciSeries {
    public static void main(String[]args){
       int g[]=new int[100];
       for(int j=0;j<100;j++){
           g[j]=j;
       }
        System.out.println(g[0]);
        System.out.println(g[1]);
        int i=2;
        while (g[i-1]<100) {
            g[i]=g[i-1]+g[i-2];
            if(g[i]>100)
                break;
            System.out.println(g[i]);
            i++;

        }
    }
}
