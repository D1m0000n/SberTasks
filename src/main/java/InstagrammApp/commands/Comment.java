package InstagrammApp.commands;

public class Comment implements Command {

    // Тип комментария int, хотя стоит понимать, что для него наверняка понадобится BigInteger
    // Для упрощения понимания, здесь и далее ID и другие численные идентификаторы будут просто типа int
    public int commentId;

    // Все равно придется сходить в БД, так что ссылку хранить смысла нет
    public int postId;

    public String commentText;

    public Comment(int commentId, int postId, String commentText) {
        this.commentId = commentId;
        this.postId = postId;
        this.commentText = commentText;
    }
}
