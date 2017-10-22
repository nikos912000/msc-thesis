import it.unibz.dao.TwitterDao;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

public class TwitterServiceImpl implements TwitterService {
	private AccessToken accessToken = null;
	private TwitterDao twitterDao;
	
    public void login(Twitter t, String parameter, RequestToken rt, long userId) throws TwitterException {
        AccessToken a = t.getOAuthAccessToken(rt, parameter);
        twitterDao.storeAccesstoken(a.getToken(), a.getTokenSecret(), userId);
    }
}