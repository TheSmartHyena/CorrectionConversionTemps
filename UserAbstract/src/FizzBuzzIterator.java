import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class FizzBuzzIterator implements Iterator<String> {
    private int current;
    private final int end;
    private final int step;
    private final List<Rule> rules;

    FizzBuzzIterator(int start, int end, int step, List<Rule> rules) {
        this.current = start;
        this.end = end;
        this.step = step;
        this.rules = rules;
    }

    @Override
    public boolean hasNext() {
        return current <= end;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        String result = fizzBuzzStringBuilder(rules, current);
        current += step;
        return result;
    }

    private static boolean isDivisibleBy(int value, int modulo) {
        return value % modulo == 0;
    }

    private static String fizzBuzzStringBuilder(List<Rule> rules, int value) {
        StringBuilder result = new StringBuilder();

        for (Rule rule : rules) {
            if (isDivisibleBy(value, rule.value)) {
                result.append(rule.text);
            }
        }

        if (result.isEmpty()) {
            result.append(value);
        }

        return result.toString();
    }
}