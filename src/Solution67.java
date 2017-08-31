/**
 * Created by cuibowu on 2017/8/31.
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int lengthA = a.length(), lengthB = b.length();
        int i = lengthA - 1, j = lengthB - 1;
        int flag = 0;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0 && j < 0) {
                sum = Integer.parseInt("" + a.charAt(i)) + flag;
            } else if (i < 0 && j >= 0) {
                sum = Integer.parseInt("" + b.charAt(j)) + flag;
            } else if (i >= 0 && j >= 0) {
                sum = Integer.parseInt("" + a.charAt(i)) + Integer.parseInt("" + b.charAt(j)) + flag;
            }
            switch (sum) {
                case 0:
                    s.insert(0, '0');
                    flag = 0;
                    break;
                case 1:
                    s.insert(0, '1');
                    flag = 0;
                    break;
                case 2:
                    s.insert(0, '0');
                    flag = 1;
                    break;
                case 3:
                    s.insert(0, '1');
                    flag = 1;
                    break;
                default:
                    break;
            }
            i--;
            j--;
        }
        if (flag == 1)
            s.insert(0, flag);
        return s.toString();
    }
}