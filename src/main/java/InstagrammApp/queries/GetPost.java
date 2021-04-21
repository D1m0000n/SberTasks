package InstagrammApp.queries;

public class GetPost<Post> implements Query<Post> {
    public int postId;

    public GetPost(int postId) {
        this.postId = postId;
    }
}
