/**
 * Created by cuibowu on 2017/8/25.
 */
public class Solution38 {
    public String countAndSay(int n){
        String res = "1";
        for(int i=1;i<=n;i++){
            res = countAndSay(res);
        }
        return res;
    }

    public String countAndSay(String res){
        StringBuilder stringBuilder = new StringBuilder();
        char current = res.charAt(0);
        int count =1;
        for(int i=1;i<res.length();i++){
            if(res.charAt(i)==current)
                count++;
            else {
                stringBuilder.append(count);
                stringBuilder.append(current);
                current=res.charAt(i);
                count=1;
            }
        }
        stringBuilder.append(count);
        stringBuilder.append(current);
        return stringBuilder.toString();
    }
}
