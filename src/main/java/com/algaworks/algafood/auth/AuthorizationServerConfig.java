package com.algaworks.algafood.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig 
	extends AuthorizationServerConfigurerAdapter { // Configurações do servidor de autorização. AuthorizationServerConfigurerAdapter serve como uma classe base para configurar o servidor de autorização OAuth2 no Spring Security. Ele fornece métodos que podem ser substituídos para personalizar o comportamento do servidor de autorização, como configuração de clientes, tokens, endpoints, etc.

}