package com.example.demo.config;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter {


    //  1) formLogin()  ---> is used to prepare the rich login form by Spring , if we dont dont specify then browser will display very basic loginform
    // 2) httpBasic()  ---> it will add the BasicAuthenticationFilter to filteChain and BasicAuthenticationFilter authenticate
    // the request ,If authentication is successful then resulting Authentication object will be placed into the SecurityContextHolder
       // example:- passing a header like Authorization: Basic bzFbdGfmZrptWY30YQ==    but base64 encoding a valid username/password combination

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/**").hasRole("USER").and().formLogin().and().httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("veeru").password("{noop}1234").roles("USER");
    }


}
