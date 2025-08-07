import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s=0,p=1;
        for(int i=n;n!=0;n=n/10){
            s=s+n%10;
            p=p*n%10;
        }
        if(s==p){
            System.out.println("Spy Number");
        }
        else
            System.out.println("Not a Spy Number");
    }
}
