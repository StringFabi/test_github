package queue;

import java.util.LinkedList;

public class BracketChecker {

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println(checkBracket(input)); // Testen Sie die Methode checkBracket mit einer Beispiel-Eingabe
    }

    public static boolean checkBracket(String input) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastOpen = stack.peek();
                if ((c == ')' && lastOpen != '(') ||
                        (c == '}' && lastOpen != '{') ||
                        (c == ']' && lastOpen != '[')) {
                    return false; // Wenn die schlie�ende Klammer nicht mit der entsprechenden �ffnenden Klammer �bereinstimmt, ist es nicht g�ltig
                }
                stack.pop();
            }
        }
        return stack.isEmpty(); // Wenn am Ende noch Klammern im Stapel �brig sind, ist es nicht g�ltig
    }
}
