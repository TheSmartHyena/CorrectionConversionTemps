public class TimeExport implements ITimeExport {
    private String txt = "";
    private int value = 0;

    public TimeExport(String txt, int value) {
        this.txt = txt;
        this.value = value;
    }

    public String export() {
        if (this.value == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        result.append(this.value);
        result.append(" ");
        result.append(this.txt);
        if (this.value > 1) {
            result.append("s");
        }

        return result.toString();
    }
}
