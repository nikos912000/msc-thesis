if (twe.@getCreatedAt@().getTime() + 1000 < lastMaxCreateTime) {
	breakPaging = true;
}
else {
	String userName = twe.@getFromUser@().toLowerCase();
	JUser user = userMap.get(userName);
	if (user == null) {
		user = new JUser(userName).init(twe);
		userMap.put(userName, user);
	}
}