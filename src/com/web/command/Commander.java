package com.web.command;

import javax.servlet.http.HttpServletRequest;

public class Commander{
	public static Command direct(HttpServletRequest request) {
		Command cm = null;
		switch(request.getParameter("action")) {
		case "move": cm = new MoveCommand();  break;
		case "search": cm = new SearchCommand(); break;
		}
	return cm;
	}
}
