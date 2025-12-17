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
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getJours() {
        return jours;
    }

    public void setJours(int jours) {
        this.jours = jours;
    }

    public int getAnnees() {
        return annees;
    }

    public void setAnnees(int annees) {
        this.annees = annees;
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
