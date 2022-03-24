package dailyCoding.day_11;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
public class BalanceBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack<Character> myStack = new Stack<>();

        HashMap<Character, Character> myMap = new HashMap<>();
        myMap.put('(', ')');
        myMap.put('[', ']');
        myMap.put('{', '}');

        char temp = 'a';

        String string = scanner.nextLine();

        String myStrCopy = "";

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '[' || string.charAt(i) == '{' || string.charAt(i) == '(') {
                myStrCopy = myStrCopy + string.charAt(i);
                myStack.push(string.charAt(i));
            }

            else if (string.charAt(i) == ']') {

                try {
                    temp = myStack.pop();
                }
                catch (EmptyStackException se) {
                    myStrCopy = myStrCopy + '[' + ']';
                    continue;
                }

                if (temp == '[') {
                    myStrCopy = myStrCopy + string.charAt(i);
                    continue;
                } else {
                    myStrCopy = myStrCopy + myMap.get(temp);
                    i = i - 1;
                }
            }

            else if (string.charAt(i) == ')') {
                try {
                    temp = myStack.pop();
                }
                catch (EmptyStackException se) {
                    myStrCopy = myStrCopy + '(' + ')';
                    continue;
                }

                if (temp == '(') {
                    myStrCopy = myStrCopy + string.charAt(i);
                    continue;
                } else {
                    myStrCopy = myStrCopy + myMap.get(temp);
                    i = i - 1;
                }
            }

            else if (string.charAt(i) == '}') {
                try {
                    temp = myStack.pop();
                } catch (EmptyStackException se) {
                    myStrCopy = myStrCopy + '{' + '}';
                    continue;
                }
                if (temp == '{') {
                    myStrCopy = myStrCopy + string.charAt(i);
                    continue;
                } else {
                    myStrCopy = myStrCopy + myMap.get(temp);
                    i = i - 1;
                }
            }
        }

        int stackLen = myStack.size();

        if (myStack.size() > 0) {
            for (int i = 0; i < stackLen; i++) {
                temp = myStack.pop();
                myStrCopy = myStrCopy + myMap.get(temp);
                System.out.println(myStrCopy);
            }

        } else {
            System.out.println(myStrCopy);
        }
    }
}