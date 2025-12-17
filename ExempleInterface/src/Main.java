void main() {
    /*ArrayList<IExport> list = new ArrayList<>();

    list.add(new TestA());
    list.add(new TestB());

    for (IExport item : list) {
        System.out.println(item.export());
        if (item instanceof TestA) {
            System.out.println(((TestA) item).exportA());
        } else if (item instanceof TestB) {
            System.out.println(((TestB) item).exporB());
        }
    }*/

    ArrayList<AForme> list = new ArrayList<>();
    list.add(new Carre(67));
    list.add(new Rectangle(12, 5));

    for (AForme item : list) {
        System.out.println(item.superficie());
    }
}
