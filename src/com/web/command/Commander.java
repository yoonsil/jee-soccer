package com.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.enums.Action;

public class Commander{
	public static Command direct(HttpServletRequest request) {
		System.out.println("3. Commander.direct() 들어옴");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		Command cm = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE: cm = new MoveCommand(request); break;
		case SEARCH: cm = new SearchCommand(request); break;
		case LOGIN: cm = new LoginCommand(request); break;
		default: break;
		}
	return cm;
	}
}
