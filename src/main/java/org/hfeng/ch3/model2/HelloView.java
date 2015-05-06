package org.hfeng.ch3.model2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello.vw")
public class HelloView extends HttpServlet {
    private String htmlTemplate = "<html>"
            + " <head>"
            + " </head>"
            + " <body>"
            + " <h1>user:%s</h1>"
            + " <h1>message:%s</h1>"
            + " </body>"
            + "</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String message = (String)req.getAttribute("message");
        String html = String.format(htmlTemplate, user, message);
        resp.getWriter().print(html);
    }
}
