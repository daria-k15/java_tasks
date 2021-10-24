public class reverseWordsInString {
    public static String reverse(String s){
        String res = "";
        String[] spl = s.split(" ");
        int i = 0;
        int j = 0;
        String l = "";
        char tmp;
        while (i < spl.length){
            while (j < spl[i].length()){
                tmp = spl[i].charAt(spl[i].length() - 1 - j);
                l += tmp;
                j++;
            }
            j = 0;
            i++;
            res += l + " ";
            l = "";
        }
        if (res.charAt(res.length() - 1) == ' ')
            res = res.substring(0, res.length() - 1);
        return (res);
    }
//    public String reverseWords(String s) {
//        String res = "";
//        String[] spl = s.split(" ");
//        int i = 0;
//        int j = 0;
//        String l = "";
//        char tmp;
//        while (i < spl.length){
//            while (j < spl[i].length()){
//                tmp = spl[i].charAt(spl[i].length() - 1 - j);
//                l += tmp;
//                j++;
//            }
//            j = 0;
//            i++;
//            res += l + " ";
//            l = "";
//        }
//        if (res.charAt(res.length() - 1) == ' ')
//            res = res.substring(0, res.length() - 1);
//        return (res);
//    }

    public static void main(String[] args){
        String s = "Hello world";
        System.out.printf("|%s|\n",reverse(s));
    }
}
