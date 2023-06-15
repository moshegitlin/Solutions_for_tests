package spring_2022_first_term;

public class Test {
    public static char fun1(String s){
        while (s.length() > 1){
            if (s.charAt(1) < s.charAt(0))
                s = s.substring(1);
            else
                s = s.charAt(0) + s.substring(2);
        }
        return s.charAt(0);
    }
    public static String fun2(String s, char c){
        int i=0;
        while( i < s.length() && s.charAt(i) != c){
            i++;
        }
        if (i < s.length())
            s = s.substring(0, i) + s.substring(i + 1);
        return s;
    }
    public static String something(String s){
        String ans = "";
        while (s.length()> 0){
            char a = fun1(s);
            s = fun2(s, a);
            ans = ans + a;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fun1("BANANA"));
        System.out.println(fun2("BANANA",'N'));
        System.out.println(something("BANANA"));
    }
}
