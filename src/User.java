import java.time.LocalDateTime;
import java.util.Objects;

public class User {
    protected String id;
    protected String username;
    protected String email;
    protected LocalDateTime createdAt;

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return id.equals(other.id) && username.equals(other.username) && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email);
    }
}
