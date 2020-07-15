package ar.edu.unju.fi;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
@Component
public class AutenticacionSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		boolean registrador = false;
		boolean consultor = false;
		boolean bd = false;

		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

		for (GrantedAuthority ga : authorities) {
			if (ga.getAuthority().equals("consultor")) {

				consultor = true;
				break;
			} else {
				if (ga.getAuthority().equals("registrador")) {

					registrador = true;
					break;
				} else {

					bd = true;
					break;
				}
			}

		}

		if (consultor) {
			redirectStrategy.sendRedirect(request, response, "/consultor");

		} else {
			if (registrador) {

				redirectStrategy.sendRedirect(request, response, "/registrador");
			} else if (bd) {

				redirectStrategy.sendRedirect(request, response, "/usuarioForm");
			} else {
				throw new IllegalStateException();
			}
		}

	}
}
