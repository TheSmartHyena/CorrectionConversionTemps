import java.util.List;

void main() {
    Config config = new Config(
            1,
            1,
            List.of(
                    new Rule(3, "Fizz"),
                    new Rule(5, "Buzz")
            )
    );
    // int N = 100;
    int N = Integer.MAX_VALUE;

    FizzBuzzIterator iterator = new FizzBuzzIterator(
            config.start,
            N,
            config.step,
            config.rules
    );

    while (iterator.hasNext()) {
        IO.println(iterator.next());
    }
}

void main1() {
    int N = 100;

    for (int i = 0; i <= N; i++) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result = Integer.toString(i);
        }
        System.out.println(result);
    }
}
