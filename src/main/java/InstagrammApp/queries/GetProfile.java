package InstagrammApp.queries;

public class GetProfile<Profile> implements Query<Profile> {
    public int profileId;

    public GetProfile(int profileId) {
        this.profileId = profileId;
    }
}
