package com.web.controllers;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.command.Receiver;
import com.web.command.Sender;
import com.web.enums.Action;
import com.web.pool.Constants;
@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service
	(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("★★★ player controller옴★★★ ");
		Receiver.init(request);
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE : request.setAttribute("page", "login"); break;
		default: break;		
		}
//		request.getRequestDispatcher(
//				String.format(Constants.DOUBLE_PATH,
//						request.getServletPath().substring(1,request.getServletPath().indexOf(".")),
//						"main"))
//		.forward(request, response);
		Sender.forward(request, response);
	}
}
