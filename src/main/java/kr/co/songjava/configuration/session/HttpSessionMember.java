package kr.co.songjava.configuration.session;

import org.springframework.stereotype.Component;

import kr.co.songjava.example.session.SessionMember;

@Component
public class HttpSessionMember extends AbstractHttpSession<SessionMember> {

	@Override
	protected String name() {
		return "SESSION_MEMBER";
	}

}
