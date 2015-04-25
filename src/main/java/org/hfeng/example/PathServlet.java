package org.hfeng.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet/*")
public class PathServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> requestURI = contextPath + servletPath + pathInfo</h1>");
        out.println("<h2> Hello! getRequestURI()</h2>");
        out.println(req.getRequestURI() + "<br>");

        out.println("<h2> Hello! getContextPath()</h2>");
        out.println(req.getContextPath() + "<br>");

        out.println("<h2> Hello! getServletPath()</h2>");
        out.println(req.getServletPath() + "<br>");

        out.println("<h2> Hello! getPathInfo()</h2>");
        out.println(req.getPathInfo() + "<br>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
