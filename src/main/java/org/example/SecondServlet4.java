package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(value = "/url-rewriting/servlet2")
public class SecondServlet4 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)  {
        try{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //getting value from the query string
        String n=request.getParameter("uname");
        out.print("Hello "+n);

        out.close();

    }catch(Exception e){System.out.println(e);}
}


}