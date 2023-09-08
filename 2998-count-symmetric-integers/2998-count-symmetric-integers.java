class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        while (low <= high) {
            int digit = getDigit(low);
            if(digit % 2 != 0){
                low++;
                continue;
            }
            int left = 0, right = 0, dummy = low;
            for (int i = 0; i < digit /2; i++){
                left += dummy%10;
                dummy /= 10;
            }
            for (int i = 0; i < digit /2; i++){
                right += dummy%10;
                dummy /= 10;
            }
            if( left == right){
                count++;
            }
            low++;
        }
        return count;
    }
    private int getDigit(int x) {
        if (x == 0) return 1;
        int result = 0;
        while (x != 0){
            result++;
            x /= 10;
        }
        return result;
    }
}