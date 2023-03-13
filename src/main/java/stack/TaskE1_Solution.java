package stack;

import java.util.*;

// Valid Parentheses
public class TaskE1_Solution {
    public static void main(String[] args) {
        String toCheck = "({{[[]]}})";
        System.out.println(isValid(toCheck));
    }
    public static boolean isValid(String s) {
        // create stack of characters

        // create map <Character, Character>


        // populate map with pairs of opening and closing brackets of each type


        // go through every character in the string
        // if map contains the character
            // if stack is not empty and character on "top" is a matching closing character
                // pop the element
            // otherwise return false
        // otherwise push character to stack

        // at the end check if the stack is empty and return true if so
            // otherwise return false

        return false;
    }
}
