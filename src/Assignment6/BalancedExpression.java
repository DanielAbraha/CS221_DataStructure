package Assignment6;

import java.util.Scanner;
import java.util.Stack;

public class BalancedExpression {


        Stack<Character> stack = new Stack<Character>();
        public boolean check(String s) {
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '[' || c == '(' || c == '{' ) {
                    stack.push(c);
                } else if(c == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                } else if(c == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if(c == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }

            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your expression.");
            String expression = input.next();
            BalancedExpression bex = new BalancedExpression();
            System.out.println(bex.check(expression));


        }
    }

