import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int c=100;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
             if(isPrime(i)){
                System.out.print(i+" ");
                c=0;
             }
        }
        if(c==100){
            System.out.println("No prime numbers");
        }
       
    }
}
