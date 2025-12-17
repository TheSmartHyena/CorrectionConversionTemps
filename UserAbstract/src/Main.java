void main() {
    ArrayList<User> list = new ArrayList<>();

    Admin admin = new Admin("Admin", "Admin");
    VisiteurRegulier visiteur = new VisiteurRegulier("visitor", "Visiteur");

    list.add(admin);
    list.add(visiteur);

    admin.ajouterUser(visiteur);

    for (User item : list) {
        item.connecter();

        if (item instanceof Admin) {
            ((Admin) item).afficherMdp();
        }
    }
}
