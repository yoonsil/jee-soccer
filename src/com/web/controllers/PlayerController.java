package com.web.controllers;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.command.Command;
import com.web.command.Commander;
import com.web.command.Receiver;
import com.web.command.Sender;
import com.web.domains.PlayerBean;
import com.web.pool.Constants;
import com.web.serviceimpls.PlayerServiceImpl;
import com.web.services.PlayerService;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service
	(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PlayerBean player = null;
		
		Receiver receiver = new Receiver();
		Commander commander = new Commander();
		Sender sender = new Sender();
		
		switch(request.getParameter("action")) {
		case "move":
			break;
		case "find2":
			request.setAttribute("positions", 
					PlayerServiceImpl.getInstance().findPositions());
			break;
		case "find4":
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			request.setAttribute("players", PlayerServiceImpl.getInstance().searchByteamId(player));
			break;
		case "find5":
			player = new PlayerBean();
			player.setTeamId(request.getParameter("teamId"));
			player.setPlayerName(request.getParameter("playerName"));
			player.setHeight(request.getParameter("height"));	
			System.out.println(player);
			request.setAttribute("players", PlayerServiceImpl.getInstance().searchByheightName(player));
			System.out.println(PlayerServiceImpl.getInstance().searchByheightName(player));
			break;
		}
		request.getRequestDispatcher(String.format
				(Constants.VEIW_PATH,"players",request.getParameter("page")))
				.forward(request, response);	
	}
}
