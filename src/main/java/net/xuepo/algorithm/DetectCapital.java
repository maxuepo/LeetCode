package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/26/17.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0) return true;
        boolean firstUpperCase = false;
        boolean allUpperCase = true;
        boolean allLowerCase = true;

        for(int i = 0; i < word.length(); i++) {
            if(i == 0) {
                firstUpperCase = Character.isUpperCase(word.charAt(i));
            } else {
                allUpperCase = allUpperCase && Character.isUpperCase(word.charAt(i));
                allLowerCase = allLowerCase && Character.isLowerCase(word.charAt(i));
            }
        }
        if(allLowerCase) return true;
        if(firstUpperCase && allUpperCase) return true;
        return false;
    }
}
