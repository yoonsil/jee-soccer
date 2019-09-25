package com.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.pool.Constants;

import lombok.Data;

@Data
public class Command implements Order{
	protected String action, domain, page, view;
	protected HttpServletRequest request;
	public void execute() {
		this.view = String.format(Constants.VEIW_PATH, page);
	}

}
