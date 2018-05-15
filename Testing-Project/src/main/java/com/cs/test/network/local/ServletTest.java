package com.cs.test.network.local;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletTest extends GenericServlet
{

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
  {
    res.setContentType("text/html");
    PrintWriter writer = res.getWriter();
    writer.write("</p>Hello Shop project</p>");
    writer.println("</p>Hello Shop Project printer</p>");
    writer.close();
  }

  @Override
  public void init() throws ServletException
  {
    System.out.println("Shop project is Initialize with Data");

  }
}
