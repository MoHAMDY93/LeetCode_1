/*
 * @lc app=leetcode id=1700 lang=java
 *
 * [1700] Number of Students Unable to Eat Lunch
 */
import java.util.*;
// @lc code=start
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> queue = new LinkedList<>();
        int idx = 0;
        int circles = 0 , sqaures = 0;
        for (var i : students) {
            queue.add(i);
            if (i == 0) circles++;
            else sqaures++;
        }
        while (!queue.isEmpty()) {
            if (queue.peek() == sandwiches[idx]) {
                if (sandwiches[idx] == 0) circles--;
                else sqaures--;
                idx++;
                queue.remove();
            } else if (sandwiches[idx] == 0) {
                if (circles == 0) {
                    return sqaures; 
                } else {
                    queue.add(queue.remove());
                }
            } else {
                if (sqaures == 0) return circles;
                else queue.add(queue.remove());
            }
        }
        return 0;
    }   
}
// @lc code=end

