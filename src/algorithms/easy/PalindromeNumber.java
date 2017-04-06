package algorithms.easy;
/**
 * <p>Title: PalindromeNumber</p>
 * <p>Description: </p>
 * @author BenZhenZhang
 * @date 2017年4月6日 下午9:26:58
 * Palindrome Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 * Tags: Math
 * Similar Problems:  (E) Palindrome Linked List
 * 
 * Notes: For palindrome int, we can compare half to half.
 * Time:O(n)
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if(x < 0 || (x!=0 && x%10==0))
			return false;
		int result = 0;
		while(result < x){
			result = result * 10 + x % 10;
			x = x / 10;
		}
		if(result == x || result/10 == x)
			return true;
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(0));
	}
}
