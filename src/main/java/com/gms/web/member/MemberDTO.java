package com.gms.web.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberDTO {
	private String id,name,password,phone,ssn,
		email,profile,birthday,gender,major,regdate;
}
