package ex;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static void main(String[] args) {
		String s="MDCXCV";
		int num=new Solution4().romanToInt(s);
		System.out.println(num);
	}
}
class Solution4 {
	private String roman="IVXLCDM";
	private Map<String, Integer> map=new HashMap<String, Integer>(){
		{
			put("I",1);
			put("V",5);
			put("X",10);
			put("L",50);
			put("C",100);
			put("D",500);
			put("M",1000);
		}
	};
    public int romanToInt(String s) {
    	String a[]=s.split("");
    	int num=0;
    	int i;
    	for(i=0;i<a.length-1;) {
    		if(roman.indexOf(a[i])<roman.indexOf(a[i+1])) {
    			num+=map.get(a[i+1])-map.get(a[i]);
    			i+=2;
    		}else {
    			num+=map.get(a[i]);
    			i++;
    		}
    	}
    
     if(i==a.length-1) {
    	 num+=map.get(a[i]);
     }	
     return num;
    }
}
