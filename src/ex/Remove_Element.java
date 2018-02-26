package ex;

public class Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {2,3,3,2};
		System.out.println(new Solution10().removeElement(nums, 3));
	}

}
class Solution10{
	 public int removeElement(int[] nums, int val) {
	          
	          int j=0;
	          for(int i=0;i<nums.length;i++) {
	        	  if(nums[i]!=val) {
	        		  nums[j]=nums[i];
	        		  j++;
	        	  }
	          }
	          return j;
	    }
}