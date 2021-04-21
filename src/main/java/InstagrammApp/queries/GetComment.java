package InstagrammApp.queries;

public class GetComment<Comment> implements Query<Comment> {
    public int commentId;

    public GetComment(int commentId) {
        this.commentId = commentId;
    }
}
