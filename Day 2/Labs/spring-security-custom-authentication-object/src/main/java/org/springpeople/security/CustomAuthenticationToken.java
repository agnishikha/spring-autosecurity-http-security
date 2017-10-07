package org.springpeople.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springpeople.security.domain.entities.AutoUser;

public class CustomAuthenticationToken  extends UsernamePasswordAuthenticationToken{

	private String make;

	public CustomAuthenticationToken(String principal, String credentials, String make) {
		super(principal, credentials);
		this.make = make;
	}

	public CustomAuthenticationToken(Object principal, Object credentials,
			Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
		// TODO Auto-generated constructor stub
	}

	public CustomAuthenticationToken(AutoUser principal, String credentials,Collection<? extends GrantedAuthority> authorities,String make) {
		super(principal, credentials,authorities);
		this.make=make;
	}
	
	public String getMake() {
		return make;
	}
	
	
}
