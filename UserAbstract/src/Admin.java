import java.util.ArrayList;

public class Admin implements User {
    private String password = "";
    private String username = "";
    private ArrayList<VisiteurRegulier> list = new ArrayList<>();

    public Admin(String password, String username) {
        this.password = password;
        this.username = username;
    }

    @Override
    public void connecter() {
        System.out.println("Admin connecté");
    }

    @Override
    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    public void ajouterUser(VisiteurRegulier user) {
        this.list.add(user);
    }

    public void afficherMdp() {
        for (VisiteurRegulier user : this.list) {
            System.out.println(user.getPassword());
        }
    }
}
