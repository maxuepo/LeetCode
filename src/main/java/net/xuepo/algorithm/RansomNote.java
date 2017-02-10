package net.xuepo.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xuepo on 2/9/17.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charBucket = new int[26];
        for(char c : magazine.toCharArray()){
            charBucket[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            if(charBucket[c - 'a'] <= 0) {
                return false;
            } else {
                charBucket[c - 'a']--;
            }
        }
        return true;
    }
}
