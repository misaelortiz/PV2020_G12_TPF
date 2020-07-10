package ar.edu.unju.fi;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	String[] resources = new String[]{
			"/include/","/css/","/icons/","/img/","/js/", "/layer/", "/webjars/**" };
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers(resources).permitAll()
		.antMatchers("/", "/home").permitAll()
		.anyRequest().authenticated().and()
		.formLogin()
		.loginPage("/login")
		.permitAll()
		.defaultSuccessUrl("/formulario")
		.failureUrl("/login?error=true")
		.usernameParameter("nombreUsuario")
		.passwordParameter("password")
		.and()
		.logout()
		.permitAll()
		.logoutSuccessUrl("/login?logout");
		
	
		}
	}


