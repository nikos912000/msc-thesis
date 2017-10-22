private void showUserView(ViewHolder holder, User currentEntity) {
        /* Get the entity text. (If the user is protected, the status may be
         * null, so account for that) */
        String text = "";
        if (currentEntity.@getStatus@() == null) {
            // TODO: add to strings.xml
            text = "You need to follow this user to see their status.";
        } else {
            text = ((User)currentEntity).@getStatus@().@getText@();
        }
        holder.text_tweet.setText(text);
        holder.text_tweet.setTypeface(mTypeface);
        Linkify.addLinks(holder.text_tweet, Linkify.ALL);
        Linkify.addLinks(holder.text_tweet, screenNameMatcher,
                 Constants.SCREEN_NAME_URI.toString() + "/");

        /* Set the tweet time Textview */
        Date createdAt = new Date();
        if (currentEntity.@getStatus@() != null) {
            createdAt = ((User)currentEntity).@getStatus@()
                .getCreatedAt();
        }
        holder.text_time.setText(new PrettyDate(createdAt).toString());
        holder.text_time.setTypeface(mTypeface);

        /* Set the screen name TextView */
        String screenName = currentEntity.@getScreenName@();
        holder.text_screenname.setText("@"+screenName);
        holder.text_screenname.setTypeface(mTypeface);

        /* Set the profile image ImageView */
        imageLoader.displayImage(screenName, holder.image_profile);
    }
