package com.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlayerBean implements Serializable{
	private String teamId, 
					playerId, 
					playerName, 
					ePlayerName, 
					nickname, 
					position, 
					nation, 
					solar,
					joinYyyy, 
					backNo, 
					birthDate, 
					height, 
					weight;
}
