{
    Twitter twitter;
    twitter = new TwitterFactory().getInstance();
    // Do something with twitter
}


{
    final TwitterFactory factory;
    GlobalSetting gs;
    Twitter twitter = factory.getInstance();
    twitter.setOAuthConsumer(gs.getTwitterConsumerKey(),gs.getTwitterConsumerSecret());
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
    String mConsumerKey;
    Twitter mTwitter;
    AccessToken mAccessToken;
    String mSecretKey;
    if (mAccessToken != null) {
        mTwitter.setOAuthConsumer(mConsumerKey, mSecretKey);
        mTwitter.setOAuthAccessToken(mAccessToken);
    }
}