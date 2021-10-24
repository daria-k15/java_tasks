public class reverseString {
    public static void reverse(char[] s){
        char tmp;
        int i = 0;
        while (i < s.length - 1 - i){
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - i - 1] = tmp;
            i++;
        }
    }

    public static void main(String[] args){
        char[] s = {'H','a','n','n','a', 'h'};
        reverse(s);
    }
}
