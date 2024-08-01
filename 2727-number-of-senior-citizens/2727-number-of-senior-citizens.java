class Solution {
    public int countSeniors(String[] details) {
        int result = 0;

        for(String detail: details){

            int firstLetter = detail.charAt(11) - '0';
            int secondLetter = detail.charAt(12) - '0';

            if(firstLetter  * 10 + secondLetter > 60){
                result++;
            }
        }

        return result;
    }
}