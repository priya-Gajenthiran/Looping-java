import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s=0,p=1;
        for(int i=1;i<=n;i++){
            s=s+i;
            p=p*i;
        }
        System.out.println(s+"\n"+p);
    }
}
