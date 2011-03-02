package net.jetztgrad.web;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class TestServlet extends HttpServlet {
	public void doGet (HttpServletRequest req,
						HttpServletResponse res)
						throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();

		out.println("<h2>Hello, world!</h2>");
		out.close();
	}
}
