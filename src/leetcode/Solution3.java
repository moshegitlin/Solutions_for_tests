package leetcode;

public class Solution3 {
    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int stop = nums.length;
        while (start < stop) {
            if (nums[start] == val) {
                nums[start] = nums[stop - 1];
                stop--;
            } else start++;

        }
        return stop;
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int stop = nums.length;
        while ((start < stop)&&(nums[start]!=target)  ){
           if (start == stop-1) return start;
            if (nums[start] < target)
                start++;
            else stop --;
        }
        return start;
    }
    public static int lengthOfLastWord(String s) {
        String [] str = s.split(" ");
        String lastWord = str[str.length-1];
        return lastWord.length();
    }
    //    public static int lengthOfLastWord(String s) {
    //    s=s.trim();
    //    if(s.indexOf(' ') == -1) return s.length();
    //    if(s.length() == 1) return 1;
    //    int count = s.length()-1;
    //    while (s.charAt(count) != ' '){
    //        count --;
    //    }
    //    return  s.length() - count -1;
    //    }
    public static void main(String[] args) {
    int [] arr ={1,3,5,6};
//        System.out.println(removeElement(arr,3));
//        System.out.println(searchInsert(arr,7));
        System.out.println(lengthOfLastWord("    day"));
    }
}