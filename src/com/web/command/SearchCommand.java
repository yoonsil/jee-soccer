package com.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.pool.Constants;
import com.web.serviceimpls.PlayerServiceImpl;

public class SearchCommand extends Command{
	public SearchCommand(HttpServletRequest request) {
		System.out.println("★★★ search command 도착★★★ ");
		
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setPage("main");
		setAction(action);
		this.execute();	
	}
	@Override
	public void execute() {
		request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
		setView(String.format(Constants.DOUBLE_PATH,"player","main"));
		request.setAttribute("page", "2_positions_a");
	}
}
