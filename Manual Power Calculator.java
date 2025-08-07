import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int e = sc.nextInt();
        int r=1;
        for(int i=1;i<=e;i++){
            r=r*n;
        }
        System.out.println(r);
    }
}
