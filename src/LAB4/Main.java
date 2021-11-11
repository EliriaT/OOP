package LAB4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> firstTask = Reader.readFile("one_expression.txt");
        System.out.print((firstTask.get(0)));
        System.out.println(" Expression is " + BracketsChecker.checkBrackets(firstTask.get(0)));

        ArrayList<String> secondTask = Reader.readFile("three_expressions.txt");
        for (int i = 0; i < secondTask.size(); i++) {
            System.out.println("Expression " + secondTask.get(i) + " is " + BracketsChecker.checkBrackets(secondTask.get(i)));
        }
    }
}