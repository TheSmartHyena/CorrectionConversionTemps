import java.util.ArrayList;
import java.util.Collections;

public class TimeExportManager {
    private int value;
    private ArrayList<ITimeExport> list = null;

    public TimeExportManager(int value) {
        this.value = value;
        this.parse();
    }

    private void parse() {
        this.list = new ArrayList<>();
        Time time = new Time(this.value);

        this.list.add(time.getSecondes());
        this.list.add(time.getMinutes());
        this.list.add(time.getHeures());
        this.list.add(time.getJours());
        this.list.add(time.getAnnees());
    }

    private ArrayList<String> getListExport() {
        ArrayList<String> result = new ArrayList<>();

        for (ITimeExport item : this.list) {
            String exported = item.export();
            if (!exported.isEmpty()) {
                result.add(exported);
            }
        }

        Collections.reverse(result);
        return result;
    }

    private String link(boolean isLast) {
        return isLast ? " et " : ", ";
    }

    public String export() {
        ArrayList<String> listExported = this.getListExport();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < listExported.size(); i++) {
            result.append(listExported.get(i));
            if (i != listExported.size() - 1) {
                result.append(this.link(i == listExported.size() - 2));
            }
        }

        return result.toString();
    }
}
