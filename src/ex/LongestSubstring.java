package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=new Solution5().lengthOfLongestSubstring("c");
		System.out.println(max);

	}

}
class Solution5 {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++) {
        	   List<Character> ch=new ArrayList<Character>();
        	for(int j=i;j<s.length();j++) {
        	if(ch.indexOf(s.charAt(j))<0) {
        		ch.add(s.charAt(j));
        	}else {
        		break;
        	}
        	
        }
        	max=ch.size()>max?ch.size():max;
        	
        }
        return max;
    }
}
