package clone.issuetracker;

import java.time.LocalDateTime;

public class Comment {
    private String text;
    private LocalDateTime time;

    public Comment(Comment comment) {
        this.text = comment.text;
        this.time = comment.time;
    }

    public Comment(String text, LocalDateTime time) {
        this.text = text;
        this.time = time;
    }
}
