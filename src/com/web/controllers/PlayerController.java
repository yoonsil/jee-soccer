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
import com.web.enums.Action;
import com.web.pool.Constants;
import com.web.serviceimpls.PlayerServiceImpl;
import com.web.services.PlayerService;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service
	(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Receiver.init(request);
		Sender.forward(request, response);
	}
}
