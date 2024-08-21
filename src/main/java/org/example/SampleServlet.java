package org.example;

//import javax.servlet.*;
import jakarta.servlet.*;

import java.io.IOException;

/**
 * @author lzp
 */
public class SampleServlet implements Servlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        resp.getWriter().println("sample ...");
//    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        servletResponse.getWriter().println("sample using servlet only...");
        System.out.println("servlet sample");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
