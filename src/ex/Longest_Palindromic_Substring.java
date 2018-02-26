package ex;

public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution8().longestPalindrome("abb"));
	}

}
class Solution8 {
    public String longestPalindrome(String s) {
        String newS=reverse(s);
        int start=0,end=0,max=0;
        int j=0,maxStart=0,maxEnd=0;
        while(j<s.length()) {
        	if(newS.charAt(j)==s.charAt(j)) {
  
        		end=j;
        		if(end-start>max) {
        			maxEnd=end;
        			maxStart=start;
        			max=end-start;
        		}
        		j++;
        	}else {
        		start++;
        		j++;
        	}
        }
        return s.substring(maxStart, maxEnd+1);
       
    }
    public String reverse(String s) {
    	StringBuilder sb=new StringBuilder();
    	for(int i=s.length()-1;i>=0;i--) {
    		sb.append(s.charAt(i));
    	}
    	return sb.toString();
    }
 
}
