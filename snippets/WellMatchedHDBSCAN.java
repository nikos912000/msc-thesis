{
   ` `@AccessToken@ @accessToken@;
   ` `@String@ oauthToken;
   ` `@String@ oAuthVerifier;
   ` `@Twitter@ @twitter@;
    try {
       ` `@accessToken@ = @twitter@.~getOAuthAccessToken~(oauthToken,oAuthVerifier);
        // Do something with accessToken

    } catch (@TwitterException@ e) {
        e.~printStackTrace~();
    }
}