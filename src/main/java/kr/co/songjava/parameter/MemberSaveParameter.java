package kr.co.songjava.parameter;

import lombok.Data;

@Data
public class MemberSaveParameter {

	private String memberId;
	private String authId;
	private String name;
	private String phoneNumber;
}
