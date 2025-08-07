public class Administrateur extends Moderateur {
    public Administrateur(String id, String username, String email) {
        super(id, username, email);
    }

    public void removeUser(Groupe groupe, User user) {
        if (groupe.getAdmin().equals(user)) {
            throw new IllegalArgumentException("Impossible de supprimer l'administrateur.");
        }
        groupe.getMembers().remove(user);
    }
}
