package ex;

import java.util.Scanner;
@SuppressWarnings("all")

public class Count_and_Say {
	public String countAndSay(int n) {
		StringBuilder sb=new StringBuilder();
		if(n==1) {
			return "1";
		}
		if(n==2) {
			return "11";
		}
		String s=countAndSay(n-1);
		int count=1;
		for (int i = 0; i<s.length()-1; ) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
				if(i+2==s.length()) {
					sb.append(count+""+s.charAt(i));
				}
				i++;
				continue;
			}else {
				sb.append(count+""+s.charAt(i));
				count=1;
				i++;
				if(i==s.length()-1) {
					sb.append("1"+s.charAt(s.length()-1));
				}
			}
			
		}
	
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input_num=sc.nextInt();
		String count_and_Say = new Count_and_Say().countAndSay(input_num);
		System.out.println(count_and_Say);
	}
}
