package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings s and t which consist of only lowercase letters.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random
 * position.
 * <p>
 * Find the letter that was added in t.
 */
public class Problem24_FindTheDifference {

    /**
     * @param s - original string
     * @param t - shuffled string
     * @return - different character
     */
    public char findTheDifference(String s, String t) {
        int[] tFrequency = new int[26];
        for (char c : t.toCharArray()) {
            tFrequency[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            tFrequency[c - 'a']--;
        }
        for (int i = 0; i < tFrequency.length; i++) {
            if (tFrequency[i] == 1) {
                return (char) ('a' + i);
            }
        }
        return '\u0000';
    }
}
