class Solution {
public:

    int product(int n) {
        int pro = 1;
        while(n > 0) {
            int ld = n % 10;
            n /= 10;
            pro *= ld;
        }

        return pro;
    }

    int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            n /= 10;
            sum += ld;
        }

        return sum;
    }

    int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }
};