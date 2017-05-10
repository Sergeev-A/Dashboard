package ru.rbs.dashboard;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;


@WebServlet("/")
public class DashBoard extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String manifest = request.getParameter("manifest");
        String time = request.getParameter("time");
        String name = request.getParameter("name");
        String qwe = request.getInputStream().toString();

        try{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.write("<html><body>");
            out.write("<p>all: " + name + time + manifest + qwe +"</p>");
            out.close();}

        catch(Exception e){}
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}