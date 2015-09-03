package com.cellebrite.security;

import com.cellebrite.security.GenericFilter;

import javax.servlet.*;

public class WorldFilter extends GenericFilter {
    private FilterConfig filterConfig;

    public void doFilter(final ServletRequest request,
                         final ServletResponse response,
                         FilterChain chain)
            throws java.io.IOException, javax.servlet.ServletException  {
        System.out.println("---- Entering Filter");
        request.setAttribute("hello", "*** Hello World! ***");
        System.out.println("username:" + request.getParameter("username"));
        System.out.println("password:" + request.getParameter("password"));

        request.setAttribute("group", "group2");
        System.out.println("parameters:" + request.getParameterMap());
        chain.doFilter(request, response);
        System.out.println("--- Exiting HelloWorldFilter");
    }
}
