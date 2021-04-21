package InstagrammApp.commands;

import java.util.Collection;

// Cоздать = изменить
public class ChangeProfile implements Command {

    // Опять же PK
    public int profileId;

    public Collection<Integer> ourPostIds;
    // ID данных профиля, по которому их можно получить из БД
    public int profileSettingsId;
}
