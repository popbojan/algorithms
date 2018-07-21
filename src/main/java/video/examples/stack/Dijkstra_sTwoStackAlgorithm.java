package video.examples.stack;

public class Dijkstra_sTwoStackAlgorithm {

    LinkedStack<String> operations = new LinkedStack();
    LinkedStack<Double> values = new LinkedStack();

    public Double calculate(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            String character = String.valueOf(expression.charAt(i));

            if (character.equals("(") || character.equals(" ")) {
                continue;
            } else if (character.equals("+") || character.equals("*")) {
                operations.push(character);
            } else if (character.equals(")")) {
                String operation = operations.pop();
                if (operation.equals("+")) {
                    values.push(values.pop() + values.pop());
                } else if (operation.equals("*")) {
                    values.push(values.pop() * values.pop());
                }
            }
            else {
                values.push(Double.parseDouble(character));
            }
        }
        return values.pop();
    }
}
