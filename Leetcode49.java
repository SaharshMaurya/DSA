package Neetcode150;
import java.util.*;
public class Leetcode49 {
	
	public static List<List<String>> group(String[] arr){
		HashMap<String, List<String>> map=new HashMap<>();
		
        for(int i=0; i<arr.length;i++) {
			
            String key=Keyset(arr[i]);
			
            
            if(!map.containsKey(key)) {
				map.put(key,  new ArrayList<>());
			}
			map.get(key).add(arr[i]);
			
			
		}


		List<List<String>> ans = new ArrayList<List<String>>();
		for(String k : map.keySet())
		{
			ans.add(map.get(k));
		}
		
		return ans;
	}

	public static String Keyset(String key)
	{
		int[] freq = new int[26];
		for(int i =0 ; i<key.length();i++)
		{
			char ch = key.charAt(i);
			freq[ch-'a']++;
		}
		
		String s = "";
		for(int i = 0; i< freq.length; i++)
		{
			s=s+" "+freq[i];
		}
		return s;
	}
	
	
}
