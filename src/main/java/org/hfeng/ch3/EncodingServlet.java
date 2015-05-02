package org.hfeng.ch3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ch3/encoding")
public class EncodingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        String name = req.getParameter("nameGet");
        name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println("Get:" + name);
    }
}
