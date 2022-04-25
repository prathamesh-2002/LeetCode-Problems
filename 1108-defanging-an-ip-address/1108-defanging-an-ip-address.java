class Solution {
    public String defangIPaddr(String address) {
        String res = new String();
        for(int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.')
                res = res.concat("[.]");
            else
                res += address.charAt(i);   
        }
        return res;
    }
}