class Solution {
    public boolean checkIfPangram(String sentence) {
        int flag = 0;
        for(int i = 97; i < 123; i++) {
            for(int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j) == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                return false;
            }
            flag = 0;
        }
        return true;
    }
}