import java.util.Stack;

//Exercise 2: Expression Balancing Using Stack
public class ExpressionBalancing {
    //balancing expression function
    public static boolean isBalanced(String expression){
        //stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        //for loop to iterates through every character of expression
        for (int i = 0; i < expression.length(); i++){
            //current char
            char current = expression.charAt(i);

            //check current for opening bracket
            if(current == '(' || current =='{' || current == '['){
                //push chat into the stack
                stack.push(current);
            } else if(current == ')' || current =='}' || current == ']'){ //closing bracket
                //check if stack is empty
                if(stack.isEmpty()){
                    return false;
                }

                //remove recent opening bracket from stack
                char top = stack.pop();

                //match the opening and closing brackets
                if ((top == '(' && current != ')') ||(top == '{' && current != '}')||(top == '[' && current != ']') ) {
                    return false;
                }
            }
        }

        //check entire expression is balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //test expressions
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("((()))"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("((())"));
        System.out.println(isBalanced("())"));
    }
}
