class Main {
    public static void main(String[] args) {
        String txt = "Foo";
        Splitted splitted = Utils.getSplitted(txt);

        System.out.println(splitted);
        System.out.println(splitted.join());
    }
}