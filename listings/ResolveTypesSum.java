{
    TwitterDao twitterDao;
    String parameter;
    Twitter t;
    long userId;
    RequestToken rt;
    AccessToken a = t.getOAuthAccessToken(rt, parameter);
    twitterDao.storeAccesstoken(a.getToken(), a.getTokenSecret(), userId);
}