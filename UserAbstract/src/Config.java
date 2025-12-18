import java.util.List;

class Config {
    int start;
    int step;
    List<Rule> rules;

    Config(int start, int step, List<Rule> rules) {
        this.start = start;
        this.step = step;
        this.rules = rules;
    }
}