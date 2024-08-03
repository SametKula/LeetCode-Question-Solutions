class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        short[] res = new short[1001];

        for(short i = 0; i<arr.length; i++){
            res[arr[i]]++;
            res[target[i]]--;
        }

        for(short e: res)
            if(e != 0)
                return false;

        return true;
    }
}