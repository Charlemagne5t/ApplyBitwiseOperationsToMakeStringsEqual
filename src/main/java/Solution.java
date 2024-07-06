public class Solution {
    public boolean makeStringsEqual(String s, String target) {

        int s1 = 0;

        int t1 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {

            }else s1++;
            if(target.charAt(i) == '0') {

            }else t1++;
        }
        if(s1 != 0 && t1 == 0){
            return false;
        }

        if(s1 == 0 && t1 != 0){
            return false;
        }



        return true;
    }
}
