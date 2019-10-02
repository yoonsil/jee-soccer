package com.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		switch(request.getParameter("page")) {
		case "login": setDomain("facade"); break;
		case "join": setDomain("facade"); break;
		case "a_back": setDomain("facade"); break;
		default: setDomain(request.getServletPath()
				.substring(1,request.getServletPath()
				.indexOf(".")));
		}
		setAction(request.getParameter("action"));
		setPage("main");
		request.setAttribute("page", request.getParameter("page"));
		execute();
	}
	
	public void execute() {
		super.execute();
	}
}
