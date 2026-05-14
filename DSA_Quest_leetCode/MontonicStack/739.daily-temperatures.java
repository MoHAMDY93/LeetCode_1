package MontonicStack;
import java.util.*;
/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] NGE = new int[n];
        Arrays.fill(NGE, -1);
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ; i>=0 ; i--) {
            while(!st.empty() && temperatures[i] >= temperatures[st.peek()])
                st.pop();
            if(!st.empty())
                NGE[i] = st.peek();
            st.push(i);
        }        
        int[] ans = new int[n];
        for(int i=0 ; i<n ; i++) {
            if(NGE[i] == -1) ans[i] = 0;
            else ans[i] = NGE[i] - i;
        }
        return ans;
    }
}
// @lc code=end

