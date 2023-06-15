package A1;
import java.util.regex.*;
public class regular_expression {

    static boolean A_special_string(String str) {
        Pattern p =Pattern.compile("^([A-Z]*)$|^([a-z]*)$");
        Matcher m = p.matcher(str);
        if (m.matches()){
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count ++;
                }
                if (count %2 !=0)
                    return false;
                count =0;
            }
            return true;
        }
        return false;
    }
    public static void main(String [] args){
       String test = "^([A-Z])a [0-9]{9}$";
       /*
       * .= all charcter
       * //w = כל תן שהוא או אות או מספר
       * //W = כל תו שהוא ךא מספר או אות
       * //s = רק תו רווח
       * //S = אסור תו רווח ושאר התווים כן
       * //d = רק מספרים
       * //D = ללא מספרים
       *
       *
       *
       *
       * */
       String date ="^([A-Z]*)|([a-z]*)$";
       Pattern p =Pattern.compile(test );
        Pattern p1 =Pattern.compile(date);
        Matcher m1 = p1.matcher("XCVBN");
       Matcher m = p.matcher("Aa 316287267");

//            System.out.println(m.matches());
//            System.out.println(m1.matches());
//           System.out.println(m.end());
        System.out.println(A_special_string("ZZNNDFDF"));
        System.out.println(A_special_string("acvbnh"));
        System.out.println(A_special_string("zzffrfrf"));
        System.out.println(A_special_string("zzffrfrfZ"));
    }
}
