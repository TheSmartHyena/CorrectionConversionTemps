public class Utils {
    static int getIndice(String str) {
        int result = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(str.charAt(i))) {
                result = i;
                break;
            }
        }

        return result;
    }

    static Splitted getSplitted(String txt) {
        int indice = Utils.getIndice(txt);
        String a = txt.substring(0, indice + 1);
        String b = txt.substring(indice + 1);

        return new Splitted(a, b);
    }

    public static String padLeft(String onWhat, int howMuch, String what) {
        StringBuilder result = new StringBuilder();
        result.append(onWhat);

        for (int i = 0; i < howMuch - onWhat.length(); i++) {
            result.insert(0, what);
        }

        return result.toString();
    }
}
