static String maskify(String txt) {
    if (txt.length() <= 4) {
        return txt;
    }

    return "#".repeat(txt.length() - 6) + txt.substring(txt.length() - 6);
}

void main() {
    System.out.println(maskify("64607935616"));
}