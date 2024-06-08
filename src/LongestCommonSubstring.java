/* Write a Java method to find the longest common substring between two given strings. */

public class LongestCommonSubstring {
    public static String longestCommonSubstring(String str1, String str2) {
        int maxLength = 0;
        int endIndex = 0;
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                }
            }
        }

        return str1.substring(endIndex - maxLength + 1, endIndex + 1);
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "zcdemf";
        System.out.println(longestCommonSubstring(str1, str2));
    }
}
