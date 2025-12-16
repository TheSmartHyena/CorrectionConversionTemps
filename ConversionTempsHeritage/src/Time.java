public class Time {
    int secondes = 0;
    int minutes = 0;
    int heures = 0;
    int jours = 0;
    int annees = 0;

    public Time(int secondes, int minutes, int heures, int jours, int annees) {
        this.secondes = secondes;
        this.minutes = minutes;
        this.heures = heures;
        this.jours = jours;
        this.annees = annees;

        System.out.println(this.toString());
    }

    public Time(int value) {
        int annees = value / TimeValues.annee;
        value = value % TimeValues.annee;

        int jours = value / TimeValues.jour;
        value = value % TimeValues.jour;

        int heures = value / TimeValues.heure;
        value = value % TimeValues.heure;

        int minutes = value / TimeValues.minute;
        value = value % TimeValues.minute;

        this(value, minutes, heures, jours, annees);
    }

    public TimeExport getSecondes() {
        return new TimeExport("seconde", this.secondes);
    }

    public TimeExport getMinutes() {
        return new TimeExport("minute", this.minutes);
    }

    public TimeExport getHeures() {
        return new TimeExport("heure", this.heures);
    }

    public TimeExport getJours() {
        return new TimeExport("jour", this.jours);
    }

    public TimeExport getAnnees() {
        return new TimeExport("annee", this.annees);
    }

    @Override
    public String toString() {
        return "Time{" +
                "secondes=" + secondes +
                ", minutes=" + minutes +
                ", heures=" + heures +
                ", jours=" + jours +
                ", annees=" + annees +
                '}';
    }
}
