package com.cos.logtest.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	private int id;

	@NotBlank(message = "이름 칸은 공백일 수 없습니다.")
	@Max(value = 10, message = "이름의 길이가 10자를 초과할 수 없습니다.")
	private String username;

	@NotBlank(message = "패스워드 칸은 공백일 수 없습니다.")
	private String password;

	@NotBlank(message = "이메일 칸은 공백일 수 없습니다.")
	private String email;
}
