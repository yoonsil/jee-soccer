package com.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class Schedule implements Serializable{
	private String scheDate, stadiumId, gubun, hometeadId, awayteamId, homeScore, awayScore;
}
