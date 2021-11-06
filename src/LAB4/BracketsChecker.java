package LAB4;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

class BracketsChecker {
    public static boolean checkBrackets(String file) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < file.length(); i++) {
            char c = file.charAt(i);

            if (c == '(') {
                stack.push(c);
                continue;
            }
            if (c == ')') {
                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
        return (stack.isEmpty());
    }
}
