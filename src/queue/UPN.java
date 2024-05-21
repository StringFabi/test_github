package queue;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UPN {
 
	public static int calculateUPN(String input) {
 
		LinkedList<Integer> stack = new LinkedList<>();
 
		//Pattern für mathematische Grundrechnungsarten
 
		Pattern operatorPattern = Pattern.compile("[+*/=");
 
		Pattern numericPattern = Pattern.compile("//d+");
 
		//Pattern für ganze Zahlen 
		for ( String token : input.split("\\s+")) {
			Matcher operatorMatcher = operatorPattern.matcher(token);
			Matcher numaricMatcher = numericPattern.matcher(token);
			if (numaricMatcher.matches()) {
				stack.push(Integer.parseInt(token));
			} else if (operatorMatcher.matches() ) {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				int result = 0;
				switch(token) {
				case "+": result = operand1 + operand2; break;
				case "-": result = operand1 - operand2; break;
				case "*": result = operand1 * operand2; break;
				case "/": result = operand1 / operand2; break;
				default : System.out.println("Ungültige Operation");
				}
				stack.push(result);
			}
		}
		return stack.pop();
	}
 
	public static void main(String[] args) {
	
 
	}
}