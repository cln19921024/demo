package com.example.gaodedemo.config;

import com.example.gaodedemo.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by ChengLina on 2018/8/21.
 */
@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{
    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception{
            return super.authenticationManager();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/","/index").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").defaultSuccessUrl("/index").permitAll().and().logout().logoutSuccessUrl("/home").permitAll();
    }
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(customUserService());
    }

    @Bean
    public CustomUserService customUserService(){
        return new CustomUserService();
    }
}
