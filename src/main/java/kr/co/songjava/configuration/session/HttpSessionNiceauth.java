package kr.co.songjava.configuration.session;

import org.springframework.stereotype.Component;

import kr.co.songjava.example.session.SessionNiceauth;

@Component
public class HttpSessionNiceauth extends AbstractHttpSession<SessionNiceauth> {

	@Override
	protected String name() {
		return "SESSION_NICEAUTH";
	}

}
