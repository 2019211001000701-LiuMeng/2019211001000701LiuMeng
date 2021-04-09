package com.LiuMeng.week6.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt=new String(request.getParameter("txt").getBytes("iso-8859-1"),"gbk");
        //The solution to Chinese garbled code found on the Internet does not work
        String search=request.getParameter("search");
        if("".equals(txt.trim()))
            response.sendRedirect("index.jsp");
        else{
            if(search.equals("baidu")){
                response.sendRedirect("https://www.baidu.com/s?wd="+txt);
            }else if(search.equals("bing")){
                response.sendRedirect("https://cn.bing.com/search?q="+txt);
            }else if(search.equals("google")){
                response.sendRedirect("https://www.google.com/search?q="+txt);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}