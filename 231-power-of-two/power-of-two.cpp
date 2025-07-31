class Solution {
public:
    bool isPowerOfTwo(int n) {
        long long ans = 1;

        for (int i = 0; i <= 30; i++) {

            if (ans == n) {
                return true;
            }

            ans = ans * 2;
        }

        return false;
    }
};