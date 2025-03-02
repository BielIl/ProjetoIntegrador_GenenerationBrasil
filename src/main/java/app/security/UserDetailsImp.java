package app.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import app.model.Usuario;

public class UserDetailsImp implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String email;
	private String password;

	public UserDetailsImp(Usuario user) {
		this.email = user.getEmail();
		this.password = user.getPassword();
	}

	public UserDetailsImp() {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}