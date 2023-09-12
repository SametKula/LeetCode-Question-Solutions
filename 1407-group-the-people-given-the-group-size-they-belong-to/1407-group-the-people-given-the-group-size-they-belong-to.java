class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        var map = new HashMap<Integer, ArrayList<Integer>>();
        var result = new ArrayList<List<Integer>>();

        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            map.putIfAbsent(groupSize, new ArrayList<>());
            map.get(groupSize).add(i);
            if (map.get(groupSize).size() == groupSize) {
                result.add(map.get(groupSize));
                map.put(groupSize, new ArrayList<>());
            }
        }
        return result;
    }
}