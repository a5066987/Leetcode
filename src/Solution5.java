/**
 * Created by cuibowu on 2017/8/31.
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        int dp=0;
        String res ="";
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s.substring(i-dp,i+1))){
                res= s.substring(i-dp,i+1);
                dp+=2;
            }else if(isPalindrome(s.substring(i-dp-1,i+1))){
                res = s.substring(i-dp-1,i+1);
                dp++;
            }
        }
        return res;
    }
    private boolean isPalindrome(String s ){
        if(s.length()==1)
            return true;
        else {
            for(int i=0,j=s.length()-1;i<j;){
                if(s.charAt(i--)!=s.charAt(j--))
                    return false;
            }
        }
        return true;
    }
}
