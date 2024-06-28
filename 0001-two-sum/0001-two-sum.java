class Solution {
    public int[] twoSum(int[] nums, int target) {
  /*      Map<Integer, Integer> hm = new HashMap<>();
        System.gc();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])){
                System.gc();
                return new int[]{i, hm.get(target - nums[i])};
            }
            hm.put(nums[i], i);
        }
        return new int[]{0,0};
*/
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(i == j){
                    continue;//ayni sayiyi kontrol etmesinin onune geciyoruz
                }

                if(nums[i] + nums[j] == target){// eger kontrol ettigimiz sayilar hedefi sagliyorsa cevabi donduruyoruz
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};

    }
}