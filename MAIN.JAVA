import java.util.Stack;
 public class MAIN{
    // Program 1: Remove Two Adjacent Duplicates
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }


    public static void main(String[] args) {
        MAIN obj = new MAIN();
        System.out.println("=== Program 1: Remove Two Duplicates ===");
        System.out.println(obj.removeDuplicates("abbaca"));
        System.out.println(obj.removeDuplicates("azxxzy"));
        System.out.println(obj.removeDuplicates("abcd"));
        System.out.println(obj.removeDuplicates("aabbcc"));
        System.out.println();
        System.out.println("=== Program 2: Remove Three Duplicates ===");
        System.out.println(
                obj.removeDuplicates("deeedbbcccbdaa")
        );
    }
}


