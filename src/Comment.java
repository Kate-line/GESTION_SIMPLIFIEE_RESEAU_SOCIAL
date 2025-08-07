import java.time.LocalDateTime;

public class Comment {
    private String authorId;
    private String content;
    private LocalDateTime createdAt;

    public Comment(String authorId, String content) {
        this.authorId = authorId;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    public String getContent() { return content; }
}