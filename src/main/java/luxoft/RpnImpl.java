package luxoft;

import java.util.Stack;

public class RpnImpl {

	public int calculate(String rpnString) {

		String rpnStrings[] = rpnString.split(" ");
		int len = rpnStrings.length;
		Stack<Integer> stack = new Stack<>();
		String value = null;
		int result = 0;
		int operand1 = 0;
		int operand2 = 0;
		if (len > 1) {
			for (int i = 0; i < len; i++) {
				value = rpnStrings[i];
				if (value.equals("+") || value.equals("-") || value.equals("/") || value.equals("*")) {
					operand2 = stack.pop();
					operand1 = stack.pop();
				} else {
					stack.push(Integer.parseInt(value));
				}
				switch (value) {
				case "+":
					result = operand1 + operand2;
					stack.push(result);
					break;
				case "/":
					result = operand1 / operand2;
					stack.push(result);
					break;
				case "-":
					result = operand1 - operand2;
					stack.push(result);
					break;
				case "*":
					result = operand1 * operand2;
					stack.push(result);
					break;
				}
			}
			result = stack.pop();
		} else {
			result = Integer.parseInt(rpnString);
		}
		return result;
	}

	public String calculateStringOutput(String rpnString) {
		int s = calculate(rpnString);
		return "" + s;
	}
}
