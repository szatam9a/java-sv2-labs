package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> commentList;

    public Issue(Issue issue, CopyMode copyMode) {
        this.name = issue.name;
        this.time = issue.time;
        this.status = issue.status;
        if (copyMode.equals(CopyMode.WITH_COMMENTS))
            this.commentList = copyComment(issue);
    }

    public List<Comment> copyComment(Issue issue) {
        List<Comment> result = new LinkedList<>();
        for (Comment c : commentList) {
            result.add(new Comment(c));
        }
        return result;
    }
}
