package com.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeamBean implements Serializable{
	private String regionName, director, webpage, address, ddd, owner, stadiumId;
	private String originYyyy, zipCode1, zipCode2, tel, fax;
}
