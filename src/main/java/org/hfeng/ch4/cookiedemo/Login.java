package org.hfeng.ch4.cookiedemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.CookieHandler;

@WebServlet("/ch4/login.do")
public class Login extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String passwd = req.getParameter("passwd");

        if ("caterpillar".equals(user) && "123456".equals(passwd)) {
            String login = req.getParameter("login");

            if ("auto".equals(login)) {
                Cookie cookie = new Cookie("user", "caterpillar");
                cookie.setMaxAge(7 * 24 * 60 * 60);
                resp.addCookie(cookie);
            }
            req.setAttribute("user", user);
            req.getRequestDispatcher("/ch4/user.vw").forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/ch4/login.html");
        }
    }
}
