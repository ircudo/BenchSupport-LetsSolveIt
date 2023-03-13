package stack;

import java.util.*;

// Generate Parentheses

public class TaskM1_Solution {
    public static void main(String[] args) {
        List<String> list = generateParenthesis(2);
        System.out.println(list);
    }
    static Stack<Character> stack = new Stack<>();
    static List<String> result = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return result;
    }
    private static void backtrack(int openN, int closedN, int n) {

        // Your code goes here...
        // Implement backtracking
    }
}
