package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServer extends AuthorizationServerConfigurerAdapter 
{
	@Value("${security.clientid}")
	private String clientId;
	
	@Value("${security.pwd}")
	private String pwd;
		
	@Value("${security.redirecturl}")
	private String redirectUrl;
	
	@Value("${security.scope}")
	private String scope;
	
	@Value("${security.access-token-validity-seconds}")
	private int accessTokenValiditySeconds;
	
	@Value("${security.refresh-token-validity-seconds}")
	private int refreshTokenValiditySeconds;
	
 	@Autowired
 	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security
		       .tokenKeyAccess("permitAll()")
		       .checkTokenAccess("permitAll()");
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
		.withClient(clientId)
		.secret(passwordEncoder.encode(pwd))
		.authorizedGrantTypes("client_credentials", "password", "authorization_code", "refresh_token")
		.scopes(scope)
		.redirectUris(redirectUrl)
		.accessTokenValiditySeconds(accessTokenValiditySeconds)
		.refreshTokenValiditySeconds(refreshTokenValiditySeconds)
		.authorities("READ_ONLY_CLIENT");
	}
}
