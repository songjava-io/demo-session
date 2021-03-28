package kr.co.songjava.example.util;

import javax.servlet.http.HttpSession;

import kr.co.songjava.example.session.SessionMember;
import kr.co.songjava.example.session.SessionNiceauth;

public class SessionUtils {

	private static final String SESSION_NAME_MEMBER = "SESSION_MEMBER";
	private static final String SESSION_NAME_NICEAUTH = "SESSION_NICEAUTH";

	public static void setMember(HttpSession session, SessionMember member) {
		session.setAttribute(SESSION_NAME_MEMBER, member);
	}

	public static SessionMember getMember(HttpSession session) {
		return (SessionMember) session.getAttribute(SESSION_NAME_MEMBER);
	}
	
	public static void setNiceauth(HttpSession session, SessionNiceauth niceauth) {
		session.setAttribute(SESSION_NAME_NICEAUTH, niceauth);
	}

	public static SessionNiceauth getNiceauth(HttpSession session) {
		return (SessionNiceauth) session.getAttribute(SESSION_NAME_NICEAUTH);
	}

	public static void removeMember(HttpSession session) {
		session.removeAttribute(SESSION_NAME_MEMBER);
	}
	
	public static void removeNiceauth(HttpSession session) {
		session.removeAttribute(SESSION_NAME_NICEAUTH);
	}
}
