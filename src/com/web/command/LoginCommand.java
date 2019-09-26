package com.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.serviceimpls.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand() {
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		if (PlayerServiceImpl.getInstance().login(null)) {
			setPage(request.getParameter("page"));
		}else {
			setPage("index.jsp");
		}
		super.execute();
	}
}
