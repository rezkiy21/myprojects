package servlets;

import entity.Calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/calc", name = "CalcServlet")
public class CalcServlet extends HttpServlet {

    double result;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/calc.jsp").forward(req,resp);
        List<String> history = (List<String>) req.getSession().getAttribute("history");
        history.add(String.valueOf(result));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String act = req.getParameter("act");
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        Calc calc = new Calc(act, Double.parseDouble(num1), Double.parseDouble(num2));

        result = calc.operation();

        req.setAttribute("result",result);
        resp.sendRedirect("/calc" + "?result=" + result);


    }
}
