package ex;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3};
		int[] b= {1,2};
		System.out.println(new Solution7().findMedianSortedArrays(a,b));
	}

}


class Solution7{
	/**
	 * 
	 * @param nums1 第一个数组
	 * @param nums2第二个数组
	 * @return
	 */
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int AllLen=len1+len2;
        if(AllLen%2==0) {
        	return (findKth(nums1,len1,0,nums2,len2,0,AllLen/2)+findKth(nums1,len1,0,nums2,len2,0,AllLen/2+1))/2;
        }else {
        	return findKth(nums1,len1,0,nums2,len2,0,AllLen/2+1);
        }
    }
public double findKth(int[] a,int m,int start_a,int[] b,int n,int start_b,int k) {
	if(m>n) {
		return findKth(b,n,start_b,a,m,start_a,k);
	}
	if(m==0) {
		return b[k-1];
	}
	if(k==1) {
		return Math.min(a[start_a], b[start_b]);
	}
	int fa=Math.min(k/2,m);
	int fb=k-fa;
	if(a[fa-1+start_a]<b[fb-1+start_b]) {
		return findKth(a,m-fa,start_a+fa,b,n,start_b,k-fa);
	}else if(a[fa-1+start_a]>b[fb-1+start_b]) {
		return findKth(a,m,start_a,b,n-fb,start_b+fb,k-fb);
	}else {
		return a[fa-1+start_a];
	}
}
}
