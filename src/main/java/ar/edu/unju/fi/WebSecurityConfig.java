package ar.edu.unju.fi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ar.edu.unju.fi.service.imp.LoginServiceImp;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	String[] resources = new String[]{
			"/include/**","/css/**","/icons/**","/img/**","/js/**", "/layer/**", "/webjars/**" };
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Aca se agrego permisos.
		http.authorizeRequests()  
		.antMatchers(resources).permitAll()
		.antMatchers("/", "/Home").permitAll()
		.anyRequest().authenticated().and()
		.formLogin()
		.loginPage("/login")
		.permitAll()
		.defaultSuccessUrl("/Home")
		.failureUrl("/login?error=true")
		.usernameParameter("nombreUsuario")
		.passwordParameter("password")
		.and()
		.logout()
		.permitAll()
		.logoutSuccessUrl("/login?logout");
		
	
		}
	
	/*BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		return bCryptPasswordEncoder;
	}
	
	@Autowired
	LoginServiceImp loginUsuarioServiceImp;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception  {
			auth.userDetailsService(loginUsuarioServiceImp).passwordEncoder(passwordEncoder());
		
	}
	*/
	}


