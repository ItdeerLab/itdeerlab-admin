package cn.itdeer.common.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * Description :
 * PackageName : cn.itdeer.common.security
 * ProjectName : itdeerlab-admin
 * CreatorName : itdeer.cn
 * CreateTime : 2018/7/28/0:01
 */
public class ItdeerSecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private AuthenticationSuccessHandler itdeerAuthenticationSuccessHandler;
    @Autowired
    private AuthenticationFailureHandler itdeerAuthenticationFailureHandler;


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.formLogin()
                .loginPage("")
                .loginProcessingUrl("")
                .successHandler(itdeerAuthenticationSuccessHandler)
                .failureHandler(itdeerAuthenticationFailureHandler)
                .and()
                .authorizeRequests()
                .antMatchers("").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();


    }
}
