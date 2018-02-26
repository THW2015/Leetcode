package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Solution2 {
    public int reverse(int x) {
    	int max=Integer.MAX_VALUE;
    	int min=Integer.MIN_VALUE;
    	if(x==0||max<x) {
    		return 0;
    	}
    	while(x%10==0) {
    		x=x/10;
    	}
    	long y=0;
    while(x!=0) {
    	int a=x%10;
    		y=y*10+a;
    		if(y>max||y<min) {
    			return 0;
    		}
    	x/=10;
    }
    return (int)y;
}
    
 }
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution2().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
