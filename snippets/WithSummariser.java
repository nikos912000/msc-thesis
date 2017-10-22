{
    User currentEntity;
    String text;
    Date createdAt;
    if (currentEntity.@getStatus@() == null) {
        // Do something
    } else {
        text = ((User)currentEntity).@getStatus@().@getText@();
    }
	// Do something with text
    if (currentEntity.@getStatus@() != null) {
        createdAt = ((User)currentEntity).@getStatus@()
        .getCreatedAt();
    }
	// Do something with createdAt
    String screenName = currentEntity.@getScreenName@();
    // Do something with screenName
}