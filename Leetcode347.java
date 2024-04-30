package Neetcode150;
import java.util.*;

public class Leetcode347 {
	
	
	
	
	class Solution {
	    public int[] topKFrequent(int[] nums, int k) {
	        return find(nums,k);
	    }
	    
	    public int[] find(int[] nums, int k)
	    {
	    
	    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	
	    	
	    	//creating a freq map
	    	for (int i = 0; i < nums.length; i++) {
				
	    		if(map.containsKey(nums[i]))
	    		{
	    			map.put(nums[i], map.get(nums[i])+1);
	    		}
	    		else
	    		{
	    			map.put(nums[i], 1);
	    		}
			}  
	    
	    	
	    	
	    	// Create bucket array for bucket sort
	    	List<Integer>[] bucket = new List[nums.length + 1];
	    	
	    	for (int key : map.keySet()) {
				int freq = map.get(key);
				
				if(bucket[freq]==null)
				{
					bucket[freq] = new ArrayList<Integer>();
				}
				
				bucket[freq].add(key);	
			}
	    	
	    	
	    	// finding k elements
	    	int[] ans = new int[k];
	    	 int count = 0;
	    	for(int i = bucket.length-1; i>=0 ; i--)
	    	{
	    		if (bucket[i] != null) 
	    		{
	    			for(int j =0; j <bucket[i].size() && count< k; j++)
	    			{
	    				ans[count++] = bucket[i].get(j);
	    			}
	    		}

	    	}
	    
	    return ans;
	    
	    
	    } //end of find
	    
	} // end of solution
}
