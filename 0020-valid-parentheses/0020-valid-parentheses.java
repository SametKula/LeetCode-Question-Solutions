class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{')
                stack.push(c);
            else if (c == ']' || c == ')' || c == '}') {
                if (stack.empty())
                    return false;

                char next = stack.pop();
                if (c == ')' && next != '(' || c == ']' && next != '[' || c == '}' && next != '{')
                    return false;
            }
        }
        return stack.empty();
    }
}