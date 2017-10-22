{
    Twitter twitter = new TwitterFactory().getInstance();

    // Get the key info from system properties
    String key = System.getProperty("twitter-consumer-key");
    String secret = System.getProperty("twitter-consumer-secret");

    try
    {
        twitter.setOAuthConsumer(key, secret);

        //Make a request token to access twitter service to request for user details
        RequestToken token = twitter.getOAuthRequestToken();

        //Make a session attribute(Some servlet background will help here!)
        HttpSession session = request.getSession();

        //we need these in callback servlet
        session.setAttribute("requestToken", token);

        //Thwe twitter login url
        String loginURL = token.getAuthenticationURL();

        //Redirect to twitter
        response.sendRedirect(loginURL);
    } catch (TwitterException e) {
        //TODO: log4j
    }
}