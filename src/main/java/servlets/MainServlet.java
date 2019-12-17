package servlets;



import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/main", name = "MainServlet")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("currentUser") == null) {
            resp.getWriter().println("<h1>Hello Guest</h1>");
        } else {
            User currentUser = (User) req.getSession().getAttribute("currentUser");
            resp.getWriter().println("<h1>Hello " + currentUser.getName() + "</h1>");
        }
        resp.sendRedirect("/main");
    }

}
