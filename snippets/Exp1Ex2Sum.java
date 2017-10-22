{
    String key;
    String secret;
    Twitter twitter = new TwitterFactory().getInstance();

    try
    {
        twitter.setOAuthConsumer(key, secret);
        RequestToken token = twitter.getOAuthRequestToken();
        String loginURL = token.getAuthenticationURL();
        // Do something with loginURL
    } catch (TwitterException e) {
        // Do something
    }
}