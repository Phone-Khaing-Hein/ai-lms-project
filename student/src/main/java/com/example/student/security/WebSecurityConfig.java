package com.example.student.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();

        auth.inMemoryAuthentication().withUser("STU001")
                .password(encoder.encode("123453"))
                .authorities("student")
        .and()
        .withUser("STU002")
        .password(encoder.encode("stu002"))
        .authorities("student");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http
               .authorizeRequests()
               .mvcMatchers("/libs/**").permitAll()
               .anyRequest()
               .authenticated()
               .and()
               .formLogin()
               .loginPage("/login")
               .defaultSuccessUrl("/home")
               .failureUrl("/login-error")
               .permitAll()
               .and()
               .logout()
               .logoutUrl("/logout")
               .logoutSuccessUrl("/login")
               .permitAll();

    }

}