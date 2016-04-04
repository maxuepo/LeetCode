package net.xuepo.algorithm;

import java.util.Stack;
/**
 * Created by xuepo on 4/3/16.
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[26];
        boolean[] existsInStack = new boolean[26];

        for (int i = 0; i < s.length(); i++) cnt[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (!stack.isEmpty() && c < stack.peek() && cnt[stack.peek() - 'a'] != 0 && existsInStack[c - 'a']) {
                existsInStack[stack.peek() - 'a'] = false;
                stack.pop();
            }

            if(!existsInStack[c - 'a']) {
                existsInStack[c - 'a'] = true;
                stack.push(c);
            }
            cnt[c - 'a']--;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
