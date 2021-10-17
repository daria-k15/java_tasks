public class Polindrom {
    public static boolean isPolindrom(int x){
        String res = "";
        int tmp;
        if (x < 0)
            return (false);
        else if (x == 0)
            return (true);
        while (x > 0){
            tmp = x % 10;
            res += String.valueOf(tmp);
            x /= 10;
        }
        int len = res.length() - 1;
        int i = 0;
        while (i != len && len > 0)
        {
            if(res.charAt(i) == res.charAt(len)){
                i++;
                len--;
            }
            else{
                return (false);
            }
        }
        return (true);
    }
    public static void main (String[] args){
        int x = 12321;
        System.out.println(isPolindrom(x));
    }
}
