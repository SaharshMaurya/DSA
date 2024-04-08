package Neetcode150;
import java.util.*;
public class Leetcode1 {
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
        	
        	int temp = target-nums[i];
			if(map.containsKey(temp))
			{
				ans[0]=i;
				ans[1]=map.get(temp);
				return ans;
			}
			map.put(nums[i],i);
		}
        
        
        
        return ans;
    }
}
