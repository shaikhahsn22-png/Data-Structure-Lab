import java.util.Stack;

//Exercise 3: Reverse a Stack
public class StackReversal {
    //reverse stack function
    public static Stack<Integer> reverseStack(Stack<Integer> original){

        //second empty Stack
        Stack<Integer> reversedStack = new Stack<>();

        while (!original.isEmpty()){
            //remove top element from the original stack
            int temp = original.pop();

            //add removed element to the second stack
            reversedStack.push(temp);

        }

        return reversedStack;
    }

    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        original.push(10);
        original.push(20);
        original.push(30);
        System.out.println("Original Stack: " + original);

        //reverse stack
        Stack<Integer> reversed = reverseStack(original);
        System.out.println("Reversed Stack: " + reversed);
    }
}
