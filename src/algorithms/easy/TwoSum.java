package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * <p>Title: TwoSum</p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * Company Tags: LinkedIn, Uber, Airbnb, Facebook, Amazon, Microsoft, Apple, Yahoo, Dropbox, Bloomberg, Yelp, Adobe
 * Tags: Array, Hash Table
 * Similar Problems: (M) 3Sum, (M) 4Sum, (M) Two Sum II - Input array is sorted, (E) Two Sum III - Data structure
 * design
 * @author BenZhenZhang
 * @date 2017年4月6日 20:25:40
 */
public class TwoSum {
	private TwoSum t;
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
	
	@Before
	public void setUp(){
		t = new TwoSum();
	}
	
	@Test
	public void testExamples(){
		int[] numbers = {3, 2, 4}; // 6 = 3 + 3
        int target = 6;
        int[] res = t.twoSum(numbers, target);
        Assert.assertArrayEquals(new int[]{1, 2}, res);
        
        numbers = new int[] {0,4,3,0};
        target = 0;
        res = t.twoSum(numbers, target);
        Assert.assertArrayEquals(new int[]{0,3}, res);
	}
	
	@After
	public void setDown(){
		t = null;
	}
}
