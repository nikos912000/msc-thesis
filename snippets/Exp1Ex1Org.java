{
	super.onCreate();
	oAuthHelper = new OAuthHelper(this);
	twitter = new TwitterFactory().getInstance();
	oAuthHelper.configureOAuth(twitter);
}