public class romanToInt {
    public static int toInt(String s){
        int x = 0;
        int i = 0;
        int len = s.length();
        while (i < len){
            if (i != len - 1 && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                x += 4;
                i++;
            }
            else if (i != len - 1  && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                x += 9;
                i++;
            }
            else if (s.charAt(i) == 'I') {
                x += 1;
            }
            else if (s.charAt(i) == 'V')
                x += 5;
            else if (i != len - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                x += 40;
                i++;
            }
            else if (i != len - 1 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C'){
                x += 90;
                i++;
            }
            else if (s.charAt(i) == 'X')
                x += 10;
            else if (s.charAt(i) == 'L')
                x += 50;
            else if (i != len - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D'){
                x += 400;
                i++;
            }
            else if (i != len - 1 && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M'){
                x += 900;
                i++;
            }
            else if (s.charAt(i) == 'C')
                x += 100;
            else if (s.charAt(i) == 'D')
                x += 500;
            else if (s.charAt(i) == 'M')
                x += 1000;
            i++;
        }
        return (x);
    }
    public static void main(String[] args){
        String s = "MCMXCIV";
        System.out.println(toInt(s));
    }
}
