package org.springpeople.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springpeople.security.domain.entities.AutoUser;
import org.springpeople.security.domain.repositories.AutoUserRepository;

@Component("customUserDetailsService")
public class CustomUserDetailsService  implements UserDetailsService{

	
	@Autowired
	private AutoUserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AutoUser user = repo.findByUsername(username);
		
		// Spring Security : User
		return new User(user.getUsername(), user.getPassword(),
				AuthorityUtils.createAuthorityList(user.getRole()));
	}

}
