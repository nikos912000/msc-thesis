{
    Editor editor;
    AccessToken token;
    if (token != null) {
        editor.putString(string, token.getToken());
        editor.putString(string, token.getTokenSecret());
    }
}