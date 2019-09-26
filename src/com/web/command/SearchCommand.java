package com.web.command;

import javax.servlet.http.HttpServletRequest;

public class SearchCommand extends Command{
	public SearchCommand(HttpServletRequest request) {
		super.setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
}
