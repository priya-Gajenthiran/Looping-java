import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum=0;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
            sum++;
        while(n!=0){
            sum++;
            n=n/10;
        }
        System.out.println(sum);
        
    }
}
