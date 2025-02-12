class Solution {
    public boolean isPalindrome(int x) {
            if (x < 0) {
            return false;
        }
        int reverse = 0, original =x;
        while (x > 0) {
            reverse = reverse * 10 + (x % 10); 
            x = x / 10; 
        }
        if ( original == reverse ) {
            return true;
        } else {
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();  
        int x = 14541;  
        System.out.println(solution.isPalindrome(x));  
    }
}
