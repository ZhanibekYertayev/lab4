package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(value = "/hidden-form-field-in-session-tracking/servlet2")
public class SecondServlet3 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)  {
        try{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //Getting the value from the hidden field
        String n=request.getParameter("uname");
        out.print("Hello "+n);

        out.close();
    }catch(Exception e){System.out.println(e);}
}
}