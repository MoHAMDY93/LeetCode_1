class Solution {
public:
    int hammingWeight(int n) {
        int cnt = 0;
        for (; n > 0 ; n /= 2) cnt += (n & 1);
        return cnt;
    }
};