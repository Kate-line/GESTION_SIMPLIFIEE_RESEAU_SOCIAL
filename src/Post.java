import java.time.LocalDateTime;
import java.util.*;

public class Post {
    private String id;
    private String authorId;
    private String content;
    private LocalDateTime createdAt;
    private List<Comment> comments = new ArrayList<>();

    public Post(String authorId, String content) {
        this.authorId = authorId;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getContent() { return content; }
    public List<Comment> getComments() { return comments; }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
