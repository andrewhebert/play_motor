package com.appspot.andrewhebert;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class AndrewJosephHebertServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.sendRedirect("http://hebertstory.blogspot.com");
	}
}
