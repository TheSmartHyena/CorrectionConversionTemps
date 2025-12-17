import java.util.ArrayList;

public class TimeExport {
    private Time time = null;

    public TimeExport(Time time) {
        this.time = time;
    }

    private String generic(int value, String word) {
        if (value == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        result.append(value);
        result.append(" ");
        result.append(word);
        if (value > 1) {
            result.append("s");
        }

        return result.toString();
    }

    private String link(boolean isBeforeLast) {
        return isBeforeLast ? " et " : ", ";
    }

    public String seconds() {
        return this.generic(this.time.getSecondes(), "seconde");
    }

    public String minutes() {
        return this.generic(this.time.getMinutes(), "minute");
    }

    public String hours() {
        return this.generic( this.time.getHeures(), "heure");
    }

    public String days() {
        return this.generic(this.time.getJours(), "jour");
    }

    public String years() {
        return this.generic(this.time.getAnnees(), "année");
    }

    public String complete() {
        StringBuilder result = new StringBuilder();

        // Une première liste complète avec des vides
        String[] list = {
                this.years(),
                this.days(),
                this.hours(),
                this.minutes(),
                this.seconds()
        };

        // On retire les vides
        ArrayList<String> listFiltered = new ArrayList<>();
        for (String item : list) {
            if (!item.isEmpty()) {
                listFiltered.add(item);
            }
        }

        // On construit la réponse
        for (int i = 0; i < listFiltered.size(); i++) {
            result.append(listFiltered.get(i));
            if (i != listFiltered.size() - 1) {
                result.append(this.link(i == (listFiltered.size() - 2) ));
            }
        }

        return result.toString();
    }
}
