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
                    return false; // Wenn die schließende Klammer nicht mit der entsprechenden öffnenden Klammer übereinstimmt, ist es nicht gültig
                }
                stack.pop();
            }
        }
        return stack.isEmpty(); // Wenn am Ende noch Klammern im Stapel übrig sind, ist es nicht gültig
    }
}
