package testers;

public class myString implements IString {
    String inputString;

    public myString(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public int IndexOf(char index) {
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == index) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(int ch) {
        if (inputString.length() == 0 || inputString.length() < inputString.indexOf(ch) || inputString.indexOf(ch) == -1)
            return -1;
        int lastindex = inputString.indexOf(ch);
        for (int i = lastindex + 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ch) lastindex = i;
        }
        return lastindex;
    }

    @Override
    public String concat(String str) {
        return inputString + " " + str;
    }

    @Override
    public String toLowerCase() {
        String newstr = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) < 'Z' && inputString.charAt(i) >= 'A') {
                newstr += (char) (inputString.charAt(i) + 32);
                continue;
            }
            newstr += inputString.charAt(i);
        }
        return newstr;
    }

    @Override
    public String toUpperCase() {
        String newstr = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) < 'z' && inputString.charAt(i) >= 'a') {
                newstr += (char) (inputString.charAt(i) - 32);
                continue;
            }
            newstr += inputString.charAt(i);
        }
        return newstr;
    }

    @Override
    public String replace(char oldChar, char newChar) {
        if (inputString.length()==0 || inputString.indexOf(oldChar) == -1) return inputString;
        String newstr = "";
        for (int i =0; i < inputString.length() ; i++) {
            if (inputString.charAt(i)== oldChar){
                newstr += newChar;
                continue;
            }
            newstr += inputString.charAt(i);

        }
        return newstr;
    }

    @Override
    public boolean contains(String ch) {
        if (inputString.length() ==0 ||
                inputString.indexOf(ch.charAt(0)) == -1 ||
                inputString.indexOf(ch.charAt(ch.length()-1))==-1) return false;
        int Start = inputString.indexOf(ch.charAt(0)), count =0;
        String test ="";
       while (Start < inputString.length()){
           if (inputString.charAt(Start) ==ch.charAt(count)){
               test+= inputString.charAt(Start);
               count++;
           }
           else {
               test = "";
               count =0;
           }
           Start ++;
           if (test.length() == ch.length()) return true;
       }
        return false;
    }

    @Override
    public String trim() {
        String newStr = "";
        boolean start= true, end = true;
        int startCount=0, endCount=inputString.length()-1;
        while (start || end){
            if(inputString.charAt(startCount) == ' '&& start)  startCount ++;
            else start = false;

            if(inputString.charAt(endCount) == ' ' && end) endCount --;
            else end = false ;
        }
        newStr = substring(startCount , endCount+1);
        System.out.println(inputString.length());
        System.out.println(newStr.length());
        return newStr;
    }

    @Override
    public String substring(int firstIndex, int lastIndex) {
        String newStr = "";
        for (int j = firstIndex; j <  lastIndex; j++) {
            newStr += inputString.charAt(j);
        }
        return newStr;
    }

    public static void main(String[] args) {
        myString m = new myString("  Moshe Gitlin    ");

        System.out.println(m.trim());
//       System.out.println(m.IndexOf('p'));
//       System.out.println(m.lastIndexOf('m'));
//       System.out.println(m.concat("it's a man"));
//        System.out.println(m.toLowerCase());
//        System.out.println(m.toUpperCase());
//        m.inputString ="HellHeloHlloHelloHello";
//        System.out.println(m.replace('l','p'));
//        System.out.println(m.contains("Hello"));
    }
}
