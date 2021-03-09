package com.demo.service.boot.security;

import java.util.regex.PatternSyntaxException;
import lombok.experimental.var;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer.AuthorizedUrl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * com.demo.service.boot.security.SecurityConfig
 *
 * @author gongcheng
 * @date 2021/3/4 14:43
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

  private ThreadLocal<String> threadLocal = new ThreadLocal<>();

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().passwordEncoder(encoder)
        .withUser("root").password(encodePassword("root")).roles("root").and()
        .withUser("admin").password(encodePassword("admin")).roles("admin");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/admin/**").hasRole("admin")
        .antMatchers("/root/**").hasRole("root")
        .anyRequest().permitAll().and().formLogin();
  }

  private String encodePassword(String password) {
    return encoder.encode(password);
  }
}
