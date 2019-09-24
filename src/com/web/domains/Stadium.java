package com.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class Stadium implements Serializable{
	private String stradiumId, stadiumName, hometeamId, seatCount, address, ddd, tel, teamId;
	
}
