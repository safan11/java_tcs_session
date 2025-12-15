package com.tcs.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // In-memory user authentication
    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin123")
                .roles("ADMIN")
                .build();

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("user123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/api/v1/home", "/api/v1/aboutus").permitAll()
                    .requestMatchers("/api/v1/addproduct").hasRole("ADMIN")
                    .requestMatchers("/api/v1/viewallproduct").hasAnyRole("USER","ADMIN")
                    .anyRequest().authenticated()
            )
            .formLogin(Customizer.withDefaults())   // enables login page + session
            .logout(logout -> logout
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/api/v1/home")
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID")
            );

        return http.build();
    
    }
}
