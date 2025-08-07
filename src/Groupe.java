import java.util.*;

public class Groupe {
    private Administrateur admin;
    private List<User> members = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public Groupe(Administrateur admin) {
        this.admin = admin;
        members.add(admin);
    }

    public Administrateur getAdmin() { return admin; }
    public List<User> getMembers() { return members; }
    public List<Post> getPosts() { return posts; }

    public void addMember(User user) { members.add(user); }
    public void addPost(Post post) { posts.add(post); }
    public boolean isMember(User user) { return members.contains(user); }

    public List<Post> searchPostsByKeyword(String keyword) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getContent().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(post);
            }
        }
        return result;
    }

    public int totalPosts() { return posts.size(); }
}
