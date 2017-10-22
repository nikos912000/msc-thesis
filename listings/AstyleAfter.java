{
    List<SavedSearch> searches;
    Twitter twitter;
    try {
        searches = twitter.getSavedSearches();
        // Do something with searches
    } catch (TwitterException e) {
        e.printStackTrace();
    }
}