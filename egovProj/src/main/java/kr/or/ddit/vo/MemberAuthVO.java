package kr.or.ddit.vo;

import lombok.Data;

@Data
public class MemberAuthVO {
	private String memId;	//필수
	private String auth;	//필수
}
