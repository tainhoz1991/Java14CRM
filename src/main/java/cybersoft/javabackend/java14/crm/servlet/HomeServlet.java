package cybersoft.javabackend.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "homeServlet", urlPatterns = {
		"/home",
		"/project-creat",
		"/project-manage",
		"/user-list",
		"/user-creat",
		"/login"
})
public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getServletPath();
		switch (url) {
		case "/home":
			req.getRequestDispatcher("/WEB-INF/views/home.jsp")
				.forward(req, resp);
			break;
		case "/project-creat":
			req.getRequestDispatcher("/WEB-INF/views/project/creat.jsp")
				.forward(req, resp);
			break;
		case "/project-manage":
			req.getRequestDispatcher("/WEB-INF/views/project/manage.jsp")
				.forward(req, resp);
			break;
		case "/user-list":
			req.getRequestDispatcher("/WEB-INF/views/user/list.jsp")
				.forward(req, resp);
			break;
		case "/user-creat":
			req.getRequestDispatcher("/WEB-INF/views/user/creat.jsp")
				.forward(req, resp);
			break;
		case "/login":
			req.getRequestDispatcher("/WEB-INF/views/auth/login.jsp")
				.forward(req, resp);
			break;
		}
	}
}
