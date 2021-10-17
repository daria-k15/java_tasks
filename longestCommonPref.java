import java.util.*;
public class longestCommonPref {
    public static String sol(String[] strs){
        String res = "";
        int len = strs.length;
        if (len == 0)
            return (res);
        if (len == 1)
            return (strs[0]);
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[len-1].length());

        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[len-1].charAt(i) )
            i++;

        res = strs[0].substring(0, i);
        return (res);
    }
    public static void main(String[] args){
        String[] strs = {"aaa", "a", "aaa"};
        String tmp = sol(strs);
        System.out.println(tmp);
    }
}
