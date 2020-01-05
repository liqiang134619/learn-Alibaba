package com.example.alibaba.cloudexampleouth2.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 * 定义OAth2服务器知道的应用程序和用户凭证
 * @author liq
 * @date 2020/1/5
 */
@Configuration
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {


    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Autowired
    AuthenticationManager authenticationManager;



    /**
     * 配置授权的应用程序
     * 用于通过验证服务器注册了哪些客户端应用程序
     * @param clients 客户端应用程序
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        // 内存中配置应用程序
        clients
                .inMemory().withClient("client")
                .secret(passwordEncoder.encode("secret"))
                .authorizedGrantTypes("refresh_token","password","authorization_code")
                .scopes("app","webapp")
                .redirectUris("http://www.baidu.com");
    }


    /**
     * 该方法定义了AuthenticationServerConfigurer中使用不同的组件，
     * 告诉spring使用spring提供的默认验证管理器
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }
}
