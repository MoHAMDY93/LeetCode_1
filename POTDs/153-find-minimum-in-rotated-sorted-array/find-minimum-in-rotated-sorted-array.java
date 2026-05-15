class Solution {
    public int findMin(int[] nums) {
        int ans = Arrays.stream(nums).min().getAsInt();
        return ans;
    }
}