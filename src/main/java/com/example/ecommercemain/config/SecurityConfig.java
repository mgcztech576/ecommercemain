//package com.example.ecommercemain.config;
//
//import org.springframework.context.annotation.Configuration;
//
//@Configuration @EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf().disable();
//        http.headers().frameOptions().sameOrigin();
//
//        http.authorizeRequests()
//                .anyRequest().permitAll();
//}
