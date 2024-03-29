package io.fdlessard.codebites.oauth2jwt.resource.jwt;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserIdAccessTokenConverter extends DefaultAccessTokenConverter {

  @Override
  public OAuth2Authentication extractAuthentication(Map<String, ?> claims) {

    OAuth2Authentication authentication = super.extractAuthentication(claims);
    authentication.setDetails(claims);

    return authentication;
  }
}