package kr.go.me.dto;

import lombok.Data;

@Data
public class FreeDTO {
	private int bno;
	private String title;
	private String content;
	private String nickname;
	private String regdate;
	private int visited;
}
