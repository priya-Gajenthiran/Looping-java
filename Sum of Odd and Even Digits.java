import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i,j=0,k=0;
        if(n<0){
            n=n*(-1);
        }
        while(n>0){
            i=n%10;
            n=n/10;
            if(i%2 != 0){
                j=j+i;
            }
            else{
                k=k+i;
            }
        }
        System.out.print(j+" "+k);
    }
}
