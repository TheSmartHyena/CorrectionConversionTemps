public class VisiteurRegulier  implements User {
    private String password = "";
    private String username = "";

    public VisiteurRegulier(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    @Override
    public void connecter() {
        System.out.println("User connecté");
    }



    public void visiterPage() {
        System.out.println("Je visite");
    }
}
