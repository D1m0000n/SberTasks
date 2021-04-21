package InstagrammApp.commands;

import java.util.ArrayList;
import java.util.Collection;

public class Post implements Command {
    // Считаем, что уникальный, чтобы был PK
    public int postId;

    public Image image;

    // Мы не знаем, кто нам поставил лайки,
    // но хранить список с профилями, которые ставили лайки на пост - точно оптимальнее,
    // чем хранить свои лайки в профиле
    public Collection<Integer> likedProfiles;
    // Аналогичные рассуждения про сбегать в БД
    public Collection<Integer> commentIds;

    public Post(int postId, Image image) {
        this.postId = postId;
        this.image = image;
        likedProfiles = new ArrayList<Integer>();
        commentIds = new ArrayList<Integer>();
    }

}
