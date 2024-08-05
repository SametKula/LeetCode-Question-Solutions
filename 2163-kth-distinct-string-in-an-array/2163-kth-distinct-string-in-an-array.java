class Solution {
    public String kthDistinct(String[] arr, int k) {
                if (k == 0 || arr.length == 0)
            return "";

        int cnt = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String s : arr)
            map.put(s, map.getOrDefault(s, 0) + 1);

        for (String s : arr) {
            if (map.get(s) == 1)
                cnt++;
            if (cnt == k)
                return s;
        }

        return "";
    }
}