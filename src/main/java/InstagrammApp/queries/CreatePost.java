package InstagrammApp.queries;

// Здесь имеется в виду, что отправляется запрос на создание поста,
// чтобы в ответ мы получили форму, в которой можем сделать этот пост

// Также считаем, что по какому-то алгоритму выбирается уникальный id для создания поста
public class CreatePost<Integer> implements Query<Integer> {
    public Integer postId;

    public CreatePost(Integer postId) {
        this.postId = postId;
    }
}
