package com.example.boot06;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder//chain
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
	private int num;
	private String name;
	private String addr;
}
