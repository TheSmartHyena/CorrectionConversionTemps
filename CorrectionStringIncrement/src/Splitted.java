import jdk.jshell.execution.Util;

public class Splitted {
    public String txt = "";
    public int nb = 0;
    public int lengthNb = 0;

    public Splitted(String txt, String nb) {
        this.txt = txt;
        this.lengthNb = nb.length();
        this.nb = !nb.isEmpty() ? Integer.parseInt(nb) : 0;
    }

    @Override
    public String toString() {
        return "Splitted{" +
                "txt='" + txt + '\'' +
                ", nb=" + nb +
                ", lengthNb=" + lengthNb +
                '}';
    }

    public String join() {
        String result = this.txt;

        int value = this.nb + 1;
        result += Utils.padLeft(Integer.toString(value), this.lengthNb, "0");

        return result;
    }
}
