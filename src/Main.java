import java.util.Stack;
public class Main {
    public static void main(String args[]) {
        String s = "Arya";
        System.out.println(reverse(s));

    }
    public static String reverse(String s) {
        Stack stack = new Stack<Character>();
        String reversedString = "";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            reversedString += stack.pop();

        }
        return reversedString;
    }
}

