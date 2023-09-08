class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        var asl = new ArrayList();
        asl.add(1);
        result.add(asl);
        asl = null;
        if (numRows <= 1) return result;
        asl = new ArrayList();
        asl.add(1);
        asl.add(1);
        result.add(asl);
        asl =null;
        if (numRows == 2) return result;
        for (int i = 2; i < numRows; i++){
            asl = new ArrayList();
            asl.add(1);
            for(int j = 1; j < i; j++){
                asl.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1)); 
            }
            asl.add(1);
            result.add(asl);
        }
        asl = null;
        return result;
    }
}