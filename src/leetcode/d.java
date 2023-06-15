package leetcode;

public class d {
    public static int strongPasswordChecker(String s) {
        int res = 0, a = 1, A = 1, d = 1;
        char[] carr = s.toCharArray();
        int[] arr = new int[carr.length];

        for (int i = 0; i < arr.length;) {
            if (Character.isLowerCase(carr[i])) a = 0;
            if (Character.isUpperCase(carr[i])) A = 0;
            if (Character.isDigit(carr[i])) d = 0;

            int j = i;
            while (i < carr.length && carr[i] == carr[j]) i++;
            arr[j] = i - j;
        }

        int total_missing = (a + A + d);

        if (arr.length < 6) {
            res += total_missing + Math.max(0, 6 - (arr.length + total_missing));

        } else {
            int over_len = Math.max(arr.length - 20, 0), left_over = 0;
            res += over_len;
//אם הוא מתחלק ב3 ושארית 2 הוא ל נוגע בכלל בלולאה זו
//  אם הוא מתחלק בדיוק ב3 הוא מוריד פעם אחת בסיבוב הראשון בלבד ומפחית מ אורך המחרוזת 1
//   אם הוא מתחלק ב 3 ושארית 1 אז רק בסיבוב השני מוריד לו שניים אלא אם כן אורך המחרוזת =1 וגם לאורך המחרוזת שניים

            for (int k = 1; k < 3; k++) {
                for (int i = 0; i < arr.length && over_len > 0; i++) {
                    if (arr[i] < 3 || arr[i] % 3 != (k - 1)) continue;
                    arr[i] -= Math.min(over_len, k);
                    over_len -= k;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 3 && over_len > 0) {
//                    פה אנחנו מטפלים בכאלה שהשארית שלהפ שווה ל2 ולכן החסרתי 2
                    int need = arr[i] - 2;
                    arr[i] -= over_len;
                    over_len -= need;
                }

                if (arr[i] >= 3) left_over += arr[i] / 3;
            }

            res += Math.max(total_missing, left_over);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordChecker("bbaaAaataa9aakaacc1c"));
     System.out.println(Solution.strongPasswordChecker("bbaa1aaAaajaakaauccp"));
        System.out.println("bbaaaaaaaaaaaaaaacccccc".length());
//        System.out.println("tttwwwdddgggkkkjjj".length()/3);
//        System.out.println(24%3);

    }
}
