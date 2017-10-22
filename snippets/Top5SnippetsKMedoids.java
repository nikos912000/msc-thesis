{
    Twitter twitter;
    twitter = new TwitterFactory().getInstance();
    // Do something with twitter
}

{
    Twitter mTwitter;
    final String CONSUMER_KEY;
    final String CONSUMER_SECRET;
    mTwitter = new TwitterFactory().getInstance();
    mTwitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
}

{

    BasicDBObject tweet;
    Status status;
    tweet.put(string, status.getUser().getScreenName());
    tweet.put(string, status.getText());
}

{
    String CONSUMER_KEY;
    AccessToken a;
    String CONSUMER_SECRET;
    Twitter twitter;
    twitter = new TwitterFactory().getInstance();
    twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
    twitter.setOAuthAccessToken(a);
}

{
    Editor e;
    AccessToken mAt;
    e.putString(string, mAt.getToken());
    e.putString(string, mAt.getTokenSecret());
}