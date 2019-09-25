package com.web.command;

import javax.servlet.http.HttpServletRequest;


public class Receiver{
	public static Command cmd = new Command();
	public void init(HttpServletRequest reuqest) {
		cmd = Commander.direct(reuqest);
	}
}
