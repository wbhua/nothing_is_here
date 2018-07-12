package easy;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/two-sum/solution/
public class twosum {
	public static void main( String [] args){
		int target = 5;
		twosum t = new twosum();
		int [] A = t.twoSum(new int []{1,4,6,8,9},target);
		System.out.println(A[0]+ " "+ A[1]);
	}
	//Brute Force
	/*public int[] twoSum(int[] nums, int target) throws IllegalArgumentException{
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}*/
	//hash table: the best way to maintain a mapping of each element in the array to its index
	/*public int[] twoSum(int[] nums, int target) throws IllegalArgumentException{
		HashMap<Integer,Integer> table = new HashMap<Integer,Integer>();
		for (int i = 0 ;i<nums.length;i++){
			table.put(nums[i], i);
		}
		for (int i = 0;i<nums.length;i++)
		{
			int key = target - nums[i];
			if (table.containsKey(key)&&table.get(key)!=i)
			{
				return new int[] {i,table.get(key)};//可能无法返回……必须加异常，不然编译器报错
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}*/
	//只用一个循环就完成：向前查找
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
