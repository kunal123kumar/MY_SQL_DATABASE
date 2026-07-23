class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int e = s.length() - 1;

        while (i < e) {

            while (i < e && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < e && !Character.isLetterOrDigit(s.charAt(e))) {
                e--;
            }

            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(e))) {
                return false;
            }

            i++;
            e--;
        }

        return true;
    }
}