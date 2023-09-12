class Solution {
    private int MOD = (int)1e9 + 7;

    private long calculateOrdersCount(long remainingPairs) {
        if (remainingPairs == 0)
            return 1;
        long currentResult = calculateOrdersCount(remainingPairs - 1) * (2 * remainingPairs - 1) * remainingPairs % MOD;
        return currentResult;
    }
    public int countOrders(int numPairs) {
        return (int)calculateOrdersCount(numPairs);
    }
}