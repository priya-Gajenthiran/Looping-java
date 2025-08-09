import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            n=n*(-1);
        }
        int i=0,c=0;
        for( c=n; c!=0 ;c=c/10)
        {
            i=i+c%10;
        }
        System.out.println(i);
    }
}
