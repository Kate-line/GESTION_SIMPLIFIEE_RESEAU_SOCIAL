
public class StandardUser extends User {
    public StandardUser(String id, String username, String email) {
        super(id, username, email);
    }

    public Post createPost(String content) {
        return new Post(this.id, content);
    }

    public void comment(Post post, String content) {
        post.addComment(new Comment(this.id, content));
    }
}
