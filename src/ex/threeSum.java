package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sql.ConnectionPoolDataSource;

public class threeSum {
	public static void main(String[] args) {
		int []num=new int[] {0,0,0};
		List<List<Integer>> list=new Solution3().threeSum(num);
		System.out.println(list);
		
	}
}
class Solution3 {
	private List<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<List<Integer>> threeSum(int[] nums) {
    	if(nums==null||nums.length<3) {
    		return list;
    	}
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length-2;i++) {
    		if(i>0&&nums[i]==nums[i-1]) {
    			continue;
    		}
    		findSum(nums, i+1, nums.length-1, nums[i]);
    	}
    	return list;
    }
    public void findSum(int[]nums,int begin,int end,int target) {
    	while(begin<end) {
    		if(target+nums[begin]+nums[end]==0) {
    			List<Integer> list1=new ArrayList<Integer>();
    			list1.add(target);
    			list1.add(nums[begin]);
    			list1.add(nums[end]);
    			list.add(list1);
    			while(nums[begin]==nums[begin+1]&&begin+1<end) {
    				begin++;
    			}
   
    			begin++;
    			
    			while(nums[end]==nums[end-1]&&begin<end) {
    				end--;
    			}
    			if(begin<end) {
    			end--;
    			}
    		}else if(target+nums[begin]+nums[end]>0) {
    			end--;
    		}else {
    			begin++;
    		}
    	}
    }
}

