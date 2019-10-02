package com.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.domains.PlayerBean;
import com.web.serviceimpls.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		//setDomain("main");
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
		param = PlayerServiceImpl.getInstance().login(param);
		setPage((param!=null)?request.getParameter("page"):"login");
		request.setAttribute("page", "2_positions_q");
		super.execute();
	}
}
