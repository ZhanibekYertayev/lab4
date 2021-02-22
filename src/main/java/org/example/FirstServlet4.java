package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(value = "/url-rewriting/servlet1")

public class FirstServlet4 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n=request.getParameter("userName");
            out.print("Welcome "+n);

            //appending the username in the query string
            out.print("<br><a href='servlet2?uname="+n+"'>visit</a>");

            out.close();

        }catch(Exception e){System.out.println(e);}
    }

}