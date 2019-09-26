package com.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.enums.Action;

public class Commander{
	public static Command direct(HttpServletRequest request) {
		Command cm = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE: cm = new MoveCommand(request); break;
		case SEARCH: cm = new SearchCommand(request); break;
		}
	return cm;
	}
}
