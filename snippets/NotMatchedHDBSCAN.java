{
    Twitter mTwitter;
    final String CONSUMER_KEY;
    final String CONSUMER_SECRET;
    mTwitter = new TwitterFactory().getInstance();
    mTwitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
}