class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] res = new int[1001];

        for(int i = 0; i<arr.length; i++){
            res[arr[i]]++;
            res[target[i]]--;
        }

        for(int e: res)
            if(e != 0)
                return false;

        return true;
    }
}