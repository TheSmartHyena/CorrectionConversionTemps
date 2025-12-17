void main() {
    Time time = new Time(40, 16, 3, 0, 0);

    time.getSecondes(); // -> Après transformation "40 secondes"

    TimeExport export = new TimeExport(time);
    System.out.println(export.complete());
}
