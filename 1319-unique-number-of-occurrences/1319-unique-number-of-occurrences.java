class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int temp[] = new int[2000];

        for(int i : arr){
            temp[i + 1000]++;
        }
        var set = new HashSet();

        for(int i :temp){
            if(i == 0)
                continue;
            if(!set.add(i))
                return false;
        }

        return true;
    }
}