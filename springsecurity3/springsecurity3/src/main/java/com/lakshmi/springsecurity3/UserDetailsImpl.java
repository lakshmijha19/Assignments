package com.lakshmi.springsecurity3;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails 
{
	private Credentials user;

	public UserDetailsImpl(Credentials user) {
		super();
		this.user = user;
	}

	
	public Collection<? extends GrantedAuthority> getAuthorities()
	{

		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
