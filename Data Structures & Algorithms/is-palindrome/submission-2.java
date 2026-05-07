class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();
        while (start < end) {
                    while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            // skip non-alphanumeric from right
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false; // stop immediately
            }
            start++;
            end--;
        }

        return true;
    }
}