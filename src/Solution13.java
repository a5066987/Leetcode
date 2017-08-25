import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuibowu on 2017/8/25.
 */
public class Solution13 {
    public int romanToInt(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        int res = 0;
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(i+1>=chars.length||map.get(chars[i+1])<=map.get(chars[i])){
                res+=map.get(chars[i]);
            }
            else{
                res-=map.get(chars[i]);
            }
        }
        return res;
    }
}
