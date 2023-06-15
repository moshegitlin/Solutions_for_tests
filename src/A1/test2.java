package A1;

public class test2 {
    public static String restoreString(String s, int[] indices) {
        char [] chararr= s.toCharArray();
        String newString ="";
        for (int i = 0; i < indices.length; i++) {
            chararr[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i <chararr.length ; i++) {
            newString+=chararr[i];
        }
        return newString;
    }

    public static void main(String[] args) {
        int arr [] ={1,0};
        System.out.println(restoreString("mz",arr));
    }
}
