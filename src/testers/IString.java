package testers;

import java.util.Locale;

public interface IString {
    public int lastIndexOf(int ch);

    public String concat(String str);

    public  String toLowerCase();

    public String toUpperCase();

    public String replace(char oldChar, char newChar);

    public boolean contains(String ch);
    String trim();
    String substring(int firstIndex,int lastIndex);
    int IndexOf(char index);
}

