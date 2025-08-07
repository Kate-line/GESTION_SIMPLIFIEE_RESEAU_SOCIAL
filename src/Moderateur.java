public class Moderateur extends StandardUser {
    public Moderateur(String id, String username, String email) {
        super(id, username, email);
    }

    public void deletePost(Groupe groupe, String postId) {
        groupe.getPosts().removeIf(p -> p.getId().equals(postId));
    }

    public void deleteComment(Post post, Comment comment) {
        post.getComments().remove(comment);
    }
}
