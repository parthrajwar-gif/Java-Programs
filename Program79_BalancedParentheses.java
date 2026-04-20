import java.util.Scanner;

public class Program79_BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expr = sc.nextLine();

        // using a char array as a manual stack
        char[] stack = new char[expr.length()];
        int top = -1;
        boolean ok = true;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // push opening brackets onto stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack[++top] = ch;
            }
            // check closing brackets
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (top < 0) {
                    ok = false;
                    break;
                }

                char last = stack[top--];

                if ((ch == ')' && last != '(') ||
                    (ch == ']' && last != '[') ||
                    (ch == '}' && last != '{')) {
                    ok = false;
                    break;
                }
            }
        }

        // if stack still has stuff, not balanced
        if (top != -1) ok = false;

        if (ok) {
            System.out.println("Parentheses are Balanced");
        } else {
            System.out.println("Parentheses are NOT Balanced");
        }

        sc.close();
    }
}
