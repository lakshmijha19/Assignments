package com.lakshmi.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());	// plaintext password, no encoding technique is used, never recommended.
		return provider;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http
		.csrf().disable()
		.authorizeRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/logout-success").permitAll();
	}
	
	

/*   ------------- In Memory (Storing our own credentials in Collections) -------------
	@Bean
	@Override
	protected UserDetailsService userDetailsService() 
	{
		List<UserDetails> users= new ArrayList<>();
		
		// Multiple Logins
		users.add(User.withDefaultPasswordEncoder().username("lakshmi").password("lakshmi@3").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("sneha").password("12345678").roles("ADMIN").build());
		users.add(User.withDefaultPasswordEncoder().username("raj").password("raj@4").roles("CREATOR").build());
		users.add(User.withDefaultPasswordEncoder().username("pradeep").password("pradeep246").roles("EDITOR").build());
		
		return new InMemoryUserDetailsManager(users);
		
		
	}
*/
}
