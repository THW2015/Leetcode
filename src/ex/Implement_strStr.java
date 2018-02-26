package ex;

public class Implement_strStr {

	public static void main(String[] args) {
		System.out.println(new Solution9().strStr("hello", "ll"));

	}
}
class Solution9 {
    public int strStr(String haystack, String needle) {
        int  len1,len2;
        int i=0,j=0;
        len1=haystack.length();
        len2=needle.length();
        if(len1<len2) {return -1;}
        else if(len1==len2){
        	if(haystack.equals(needle)) {
        		return 0;
        	}else {
        		return -1;
        	}
        }else {
        	for(i=0;i<=len1-len2;i++) {
        		for(j=0;j<len2;j++) {
        			if(haystack.charAt(i+j)==needle.charAt(j)) {
        				continue;
        			}else {
        				break;
        			}
        			
        		}
        		if(j==len2) {
    				return i;
    			}
        	}
        return -1;
        }
    }
}