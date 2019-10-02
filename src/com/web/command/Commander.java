package com.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.enums.Action;

public class Commander extends Command{
	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
		System.out.println(request.getParameter("action")+"★★★ action값★★★ ");
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE : cmd = new MoveCommand(request); break;
		case LOGIN : cmd = new LoginCommand(request); break;
		case CREATE: cmd = new CreateCommand(request); break;
		case SEARCH: cmd = new SearchCommand(request); break;
		default: break;
		}
		return cmd;
	}
}